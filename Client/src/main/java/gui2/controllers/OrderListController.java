package gui2.controllers;

import client.Client;
import client.Order;
import gui2.core.ViewHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import jfxtras.styles.jmetro.JMetroStyleClass;

import java.util.Optional;

public class OrderListController {
    @FXML
    public AnchorPane anchorPane;
    @FXML
    public TableView<Order> tableView;
    @FXML
    public TableColumn<Order, String> idColumn;
    @FXML
    public TableColumn<Order, String> descriptionColumn;
    @FXML
    public TableColumn<Order, String> amountColumn;
    @FXML
    public TableColumn<Order, String> deliveredColumn;
    @FXML
    public TextField searchLabel;


    public static ObservableList<Order> orders;
    public static  Order selectedOrder;
    public static int selectedIndex;


    private ViewHandler vh;

    private Client client = Client.getInstance();

    public void init(ViewHandler vh) {
        anchorPane.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        this.vh = vh;
        orders = FXCollections.observableArrayList(client.getPort().loadOrders());
        idColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("id"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("description"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("amount"));
        deliveredColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("delivered"));
        tableView.setItems(orders);
    }

    public void createOrder(){
        vh.openCreateOrderScene();
    }

    public void delete() {
        selectedOrder = tableView.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Order");
        alert.setHeaderText("Are you sure you want to delete order #" + selectedOrder.getId() + "?");
        //alert.setContentText(selectedOrder.);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            boolean response = client.getPort().delete(selectedOrder.getId());
            if (response) {
                tableView.getItems().remove(selectedOrder);
            }
        }
    }

    public void update() {
        selectedOrder = tableView.getSelectionModel().getSelectedItem();
        selectedIndex = tableView.getSelectionModel().getSelectedIndex();
        vh.openUpdateScene();
    }

    public void search() {
        System.out.println("Controller: " + searchLabel.getText());
        client.getPort().readByCharacters(searchLabel.getText());
    }
}
