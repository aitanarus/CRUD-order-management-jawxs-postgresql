package persistance;

import model.Order;

import java.util.ArrayList;

public interface OrderDAO {
    Order create(Order order);
    ArrayList<Order> readByCharacters(String characters);
    boolean update(Order order);
    boolean delete(int id);
    ArrayList<Order> loadOrders();
}
