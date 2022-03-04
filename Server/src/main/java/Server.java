import service.OrderCRUDServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:1234/order-crud-service";
        Endpoint endpoint = Endpoint.publish(address, new OrderCRUDServiceImpl());
        System.out.println("Server is ready...");
    }
}