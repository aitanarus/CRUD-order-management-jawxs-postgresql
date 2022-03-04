package gui.core;

import com.pixelduke.control.skin.FXSkins;
import gui.controllers.CreateOrderController;
import gui.controllers.OrderListController;
import gui.controllers.UpdateOrderController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class ViewHandler {
    private Stage orderListStage;
    private Scene orderListScene;
    private Stage createOrderStage;
    private Scene createOrderScene;
    private Stage updateOrderStage;
    private Scene updateOrderScene;

    JMetro jMetro = new JMetro(Style.LIGHT);


    public void start() {
        orderListStage = new Stage();
        openOrderListScene();
    }

    private void openOrderListScene() {
        FXMLLoader loader = new FXMLLoader();
        if (orderListScene == null) {
            Parent root = getRoot("/OrderList.fxml", loader);
            OrderListController controller = loader.getController();
            controller.init(this);
            orderListScene = new Scene(root);

            jMetro.setScene(orderListScene);
            orderListScene.getStylesheets().add(FXSkins.getStylesheetURL());

        }
        orderListStage.setTitle("Orders List");
        orderListStage.setScene(orderListScene);
        orderListStage.show();
    }

    public void openCreateOrderScene() {
        FXMLLoader loader = new FXMLLoader();
        createOrderStage = new Stage();
        if (createOrderScene == null) {
            Parent root = getRoot("/CreateOrder.fxml", loader);
            CreateOrderController controller = loader.getController();
            controller.init(this);
            createOrderScene = new Scene(root);

            jMetro.setScene(createOrderScene);
            orderListScene.getStylesheets().add(FXSkins.getStylesheetURL());
        }
        createOrderStage.setTitle("Create Order");
        createOrderStage.setScene(createOrderScene);
        createOrderStage.show();
    }

    public void openUpdateScene(){
        FXMLLoader loader = new FXMLLoader();
        updateOrderStage = new Stage();
        if (updateOrderScene == null) {
            Parent root = getRoot("/UpdateOrder.fxml", loader);
            UpdateOrderController controller = loader.getController();
            controller.init(this);
            updateOrderScene = new Scene(root);
            jMetro.setScene(updateOrderScene);
            //orderListScene.getStylesheets().add(FXSkins.getStylesheetURL());
        }
        updateOrderStage.setTitle("Update Order");
        updateOrderStage.setScene(updateOrderScene);
        updateOrderStage.show();
    }

    public void closeCreateOrderStage(){
        createOrderStage.close();
    }

    public void closeUpdateOrderStage(){
        updateOrderStage.close();
    }

    private Parent getRoot(String s, FXMLLoader loader) {
        Parent root = null;
        loader.setLocation(getClass().getResource(s));
        System.out.println(getClass().getResource(s));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }

}
