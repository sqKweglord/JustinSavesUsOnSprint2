package com.example.justinsavesusonsprint2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {


    public Button startOrder;

    @FXML
    protected void onStartOrder() {
        Main.startOrder();

        Stage stage = (Stage) startOrder.getScene().getWindow();
        stage.close();
    }
}