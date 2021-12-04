package com.example.justinsavesusonsprint2;

import MenuItems.Drink;
import MenuItems.MenuItem;
import MenuItems.Pizza;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;

public class OrderController {

    public Button addPizza;
    public Button addDrink;
    public ListView<MenuItem> orderList;
    public Label totalText;
    public Button processOrder;
    public Button cancelOrder;

    public void updateTotal(double num) {
        DecimalFormat df = new DecimalFormat(".##");
        totalText.setText(
                "$" + df.format(num)
        );
    }

    public void updateOrders() {
        orderList.setItems(
                FXCollections.observableArrayList(Main.items)
        );
        updateTotal(420.69);
    }

    public void addDrink() {
        Main.items.add(
                new Drink("Pepsi", MenuItem.sizes.SMALL)
        );
        updateOrders();
    }

    public void addPizza() {
        Main.items.add(
                new Pizza("Cheese", MenuItem.sizes.SMALL)
        );
        updateOrders();
    }

    public void removeMenuItem() {
        MenuItem item = orderList.getSelectionModel().getSelectedItem();
        if (item != null)
            Main.items.remove(item);
        updateOrders();
    }

    public void cancelOrder() {
        Stage stage = (Stage) cancelOrder.getScene().getWindow();
        stage.close();
    }

    public void processOrder() {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("checkout.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            CheckoutController controller = fxmlLoader.getController();
            controller.init();
            stage.setTitle("Checkout");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) processOrder.getScene().getWindow();
        stage.close();
    }

}