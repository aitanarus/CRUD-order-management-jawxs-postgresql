package client;

public class Client{

    private static Client instance;
    private OrderCRUDService_Service messagingService = new OrderCRUDService_Service();
    private OrderCRUDService port  = messagingService.getOrderCRUDServiceImplPort();

    public static synchronized Client getInstance(){
        if (instance == null) {
            instance = new Client();
        }
        return instance;
    }

    public OrderCRUDService getPort() {
        return port;
    }
}
