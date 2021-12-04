package com.example.Sprint2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckoutController {

    public TextField nameField;
    public TextField phoneNumberField;
    public ComboBox<String> paymentTypeDropdown;
    public TextField creditCardNumberField;
    public TextField ccvField;
    public TextField expirationField;
    public TextField accountNumField;
    public TextField routingNumField;
    public TextField amountField;
    public CheckBox isDelivering;
    public TextField addressField;
    public Button processPayment;
    public Button cancelOrder;

    public void init() {
        paymentTypeDropdown.getItems().addAll(
                "Cash", "Credit/Debit", "Check"
        );
        paymentTypeDropdown.setValue("Cash");
        setFieldsAsCash();
    }

    public void updatePaymentType() {
        switch (paymentTypeDropdown.getSelectionModel().getSelectedItem()) {
            case "Cash" -> setFieldsAsCash();
            case "Credit/Debit" -> setFieldsAsCreditDebit();
            case "Check" -> setFieldsAsCheck();
        }
    }

    public void setFieldsAsCash() {
        creditCardNumberField.setDisable(true);
        ccvField.setDisable(true);
        expirationField.setDisable(true);

        accountNumField.setDisable(true);
        routingNumField.setDisable(true);
        amountField.setDisable(true);
    }

    public void setFieldsAsCreditDebit() {
        creditCardNumberField.setDisable(false);
        ccvField.setDisable(false);
        expirationField.setDisable(false);

        accountNumField.setDisable(true);
        routingNumField.setDisable(true);
        amountField.setDisable(true);
    }

    public void setFieldsAsCheck() {
        creditCardNumberField.setDisable(true);
        ccvField.setDisable(true);
        expirationField.setDisable(true);

        accountNumField.setDisable(false);
        routingNumField.setDisable(false);
        amountField.setDisable(false);
    }

    public void cancelOrder() {
        Stage stage = (Stage) cancelOrder.getScene().getWindow();
        stage.close();
    }

    public void processPayment() {

        Main.customerName = nameField.getText();
        Main.address = addressField.getText();
        Main.phoneNumber = phoneNumberField.getText();

        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("receipt.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            ReceiptController controller = fxmlLoader.getController();
            controller.init();
            stage.setTitle("Thanks for your order!");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) processPayment.getScene().getWindow();
        stage.close();
    }

}