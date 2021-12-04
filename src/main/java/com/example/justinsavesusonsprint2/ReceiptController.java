package com.example.justinsavesusonsprint2;

import MenuItems.MenuItem;
import javafx.collections.FXCollections;
import javafx.scene.control.*;

public class ReceiptController {

    public Label customerName;
    public Label phoneNumber;
    public Label address;
    public ListView<MenuItem> order;

    public void init() {
        order.setItems(
                FXCollections.observableArrayList(Main.items)
        );
        customerName.setText(Main.customerName);
        phoneNumber.setText(Main.phoneNumber);
        address.setText(Main.address);
    }

}