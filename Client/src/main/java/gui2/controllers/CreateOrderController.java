package gui2.controllers;


import client.Client;
import client.Order;
import gui2.core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import jfxtras.styles.jmetro.JMetroStyleClass;

import java.util.Optional;

public class CreateOrderController {

    @FXML
    public TextField amount;
    @FXML
    public ChoiceBox delivered;
    @FXML
    public TextArea description;
    public AnchorPane anchorPane;

    private ViewHandler vh;

    private Client client = Client.getInstance();

    public void init(ViewHandler vh) {
        anchorPane.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        this.vh = vh;
        delivered.getItems().add("True");
        delivered.getItems().add("False");
    }

    public void createOrder() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Create New Order");
        alert.setHeaderText("Are you sure you want to create a new order?");
        alert.setContentText("New Order: " + description.getText() + ", " + amount.getText() + ", " + (String) delivered.getValue());
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK){
            Order response = client.getPort().create(description.getText(), amount.getText(), (String) delivered.getValue());
            if(response != null){
                OrderListController.orders.add(response);
            }
            amount.clear();
            description.clear();
            vh.closeCreateOrderStage();
        } else {
            amount.clear();
            description.clear();
        }
    }

    public void cancel() {
       vh.closeCreateOrderStage();
    }
}
