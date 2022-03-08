package service;

import model.Order;
import persistance.OrderDAO;
import persistance.OrderDAOImpl;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

@WebService(endpointInterface = "service.OrderCRUDService", serviceName = "OrderCRUDService")
public class OrderCRUDServiceImpl implements OrderCRUDService {

    OrderDAO orderDAO;
    {
        try {
            orderDAO = OrderDAOImpl.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @WebMethod
    @Override
    public Order create(String description, String amount, String delivered) {
        return orderDAO.create(new Order(description, Float.parseFloat(amount), Boolean.valueOf(delivered)));
    }

    @Override
    public ArrayList<Order> readByCharacters(String characters, ArrayList<Order> orders) {
        System.out.println(orders.size());
        ArrayList <Order> searchResult = new ArrayList<>();
        for(Order order : orders) {
            if (order.toString().contains(characters)){
                System.out.println(order.toString().contains(characters));
                searchResult.add(order);
            }
        }
        return searchResult;
    }

    @Override
    public boolean update(int id, String description, String amount, String delivered) {
        return orderDAO.update(new Order(id, description, Float. parseFloat(amount), Boolean.valueOf(delivered)));
    }

    @Override
    public boolean delete(int id) {
        return orderDAO.delete(id);
    }

    @Override
    public ArrayList<Order> loadOrders() {
        return orderDAO.loadOrders();
    }


}
