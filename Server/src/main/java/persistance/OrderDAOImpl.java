package persistance;

import model.Order;
import java.sql.*;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    private static OrderDAOImpl instance;

    private OrderDAOImpl() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized OrderDAOImpl getInstance() throws SQLException {
        if (instance == null) {
            instance = new OrderDAOImpl();
        }
        return instance;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
    }

    @Override
    public Order create(Order order) {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO public.orders (description, amount, delivered) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, order.description);
            statement.setInt(2, (int) order.amount);
            statement.setBoolean(3, order.delivered);
            statement.executeUpdate();
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                return new Order(keys.getInt(1), order.description, order.amount, order.delivered);
            } else {
                throw new SQLException("No keys generated");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Order> readByCharacters(String characters) {
        System.out.println("DAO: " + characters);
        try(Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM orders WHERE description = ? LIKE ?");
            statement.setString(1, characters);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Order> result = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt("orderid");
                String description = resultSet.getString("description");
                int amount = resultSet.getInt("amount");
                boolean delivered = resultSet.getBoolean("delivered");
                Order order = new Order(id, description, amount, delivered);
                result.add(order);
            }
            System.out.println(result.size());
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(Order order) {
        try(Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE public.orders SET description = ?, amount = ?, delivered = ? WHERE orderid = ?");
            statement.setString(1, order.description);
            statement.setFloat(2, order.amount);
            statement.setBoolean(3, order.delivered);
            statement.setInt(4, order.id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try(Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM public.orders WHERE orderid = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Order> loadOrders() {
        try(Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM public.orders");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Order> result = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt("orderid");
                String description = resultSet.getString("description");
                int amount = resultSet.getInt("amount");
                boolean delivered = resultSet.getBoolean("delivered");
                Order order = new Order(id, description, amount, delivered);
                result.add(order);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
