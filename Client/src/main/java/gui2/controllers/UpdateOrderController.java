package gui2.controllers;

import client.Client;
import client.Order;
import gui2.core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import jfxtras.styles.jmetro.JMetroStyleClass;

import java.util.Optional;

public class UpdateOrderController {
    @FXML
    public TextField amount;
    @FXML
    public ChoiceBox delivered;
    @FXML
    public TextArea description;
    @FXML
    public AnchorPane anchorPane;

    private Client client = Client.getInstance();
    private ViewHandler vh;

    public void init(ViewHandler vh) {
        anchorPane.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        this.vh = vh;
        delivered.getItems().add("True");
        delivered.getItems().add("False");
    }

    public void updateOrder() {
        Order orderToUpdate = OrderListController.selectedOrder;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Order");
        alert.setHeaderText("Are you sure you want to update order #" + orderToUpdate.getId() + "?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            boolean response = client.getPort().update(orderToUpdate.getId(), description.getText(), amount.getText(), (String) delivered.getValue());
            if (response) {
                Order updateOrder = new Order();
                updateOrder.setId(OrderListController.selectedOrder.getId());
                updateOrder.setDescription(description.getText());
                updateOrder.setAmount(Float.parseFloat(amount.getText()));
                updateOrder.setDelivered(Boolean.parseBoolean((String) delivered.getValue()));
                OrderListController.orders.set(OrderListController.selectedIndex, updateOrder);
                description.clear();
                amount.clear();
                vh.closeUpdateOrderStage();
            }
        }
    }

    public void cancel() {
        vh.closeUpdateOrderStage();
    }
}
