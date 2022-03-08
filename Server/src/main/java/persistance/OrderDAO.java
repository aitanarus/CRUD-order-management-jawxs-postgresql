package persistance;

import model.Order;

import java.util.ArrayList;

public interface OrderDAO {
    Order create(Order order);
    boolean update(Order order);
    boolean delete(int id);
    ArrayList<Order> loadOrders();
}
