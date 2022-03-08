package service;

import model.Order;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface OrderCRUDService {
    Order create(@WebParam(name="description") String description, @WebParam(name="amount") String amount, @WebParam(name="delivered") String delivered);
    ArrayList<Order> readByCharacters(@WebParam(name="character") String characters, @WebParam(name = "orders") ArrayList<Order> orders);
    boolean update(@WebParam (name="id") int id, @WebParam(name="description") String description, @WebParam(name="amount") String amount, @WebParam(name="delivered") String delivered);
    boolean delete(@WebParam(name="id") int id);
    ArrayList<Order> loadOrders();
}
