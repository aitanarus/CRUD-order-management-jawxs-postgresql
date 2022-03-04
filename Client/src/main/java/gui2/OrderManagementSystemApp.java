package gui2;

import gui2.core.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class OrderManagementSystemApp extends Application {
    @Override
    public void start(Stage stage) {
        ViewHandler vh = new ViewHandler();
        vh.start();
    }
}
