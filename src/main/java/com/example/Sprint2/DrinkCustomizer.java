package com.example.Sprint2;

import MenuItems.Drink;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class DrinkCustomizer {

    public ComboBox<String> sizeDropdown;
    public ComboBox<String> typeDropdown;

    public Button cancel;
    public Button edit;

    Drink drink;

    public void init(Drink drink) {
        this.drink = drink;
        sizeDropdown.getItems().addAll(
                "20-Ounce", "1-Liter", "2-Liter"
        );
        sizeDropdown.setValue("20-Ounce");
        typeDropdown.getItems().addAll(
               "Pepsi", "Diet Pepsi", "Sierra Mist", "Cheerwine", "Mountain Dew"
        );
        typeDropdown.setValue("Pepsi");
    }

    public void cancelAndDeleteItem() {
        Main.items.remove(this.drink);
        Stage stage = (Stage) edit.getScene().getWindow();
        stage.close();
    }

    public void saveAndExit() {
        drink.setType(typeDropdown.getSelectionModel().getSelectedItem());
        drink.setSize(sizeDropdown.getSelectionModel().getSelectedItem());

        Stage stage = (Stage) edit.getScene().getWindow();
        stage.close();
    }
}