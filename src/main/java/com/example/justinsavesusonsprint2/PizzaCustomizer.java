package com.example.justinsavesusonsprint2;

import MenuItems.Pizza;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PizzaCustomizer {

    public ComboBox<String> sizeDropdown;
    public ComboBox<String> crustDropdown;
    public ComboBox<String> typeDropdown;

    public CheckBox checkboxPepperoni;
    public CheckBox checkboxSausage;
    public CheckBox checkboxHam;
    public CheckBox checkboxMushroom;
    public CheckBox checkboxPineapple;
    public CheckBox checkboxBlackOlives;
    public CheckBox checkboxGreenPeppers;
    public CheckBox checkboxOnions;
    public CheckBox checkboxTomato;
    public CheckBox checkboxBacon;

    public Button cancel;
    public Button edit;

    Pizza pizza;

    public void init(Pizza pizza) {

        this.pizza = pizza;

        sizeDropdown.getItems().addAll(
                "10-inch", "12-inch", "14-inch", "16-inch"
        );
        sizeDropdown.setValue("12-inch");
        crustDropdown.getItems().addAll(
                "Thin Crust", "Hand Tossed", "Pan Crust"
        );
        crustDropdown.setValue("Thin Crust");
        typeDropdown.getItems().addAll(
                "Cheese", "Pepperoni", "Meat Lovers", "Supreme", "Hawaiian", "Garden"
        );
        typeDropdown.setValue("Cheese");
    }

    @FXML
    public void updateToppings() {
        checkboxPepperoni.setSelected(false);
        checkboxSausage.setSelected(false);
        checkboxHam.setSelected(false);
        checkboxMushroom.setSelected(false);
        checkboxPineapple.setSelected(false);
        checkboxBlackOlives.setSelected(false);
        checkboxGreenPeppers.setSelected(false);
        checkboxOnions.setSelected(false);
        checkboxTomato.setSelected(false);
        checkboxBacon.setSelected(false);

        switch (typeDropdown.getSelectionModel().getSelectedItem()) {
            case "Pepperoni" -> {
                checkboxPepperoni.setSelected(true);
            }
            case "Meat Lovers" -> {
                checkboxPepperoni.setSelected(true);
                checkboxSausage.setSelected(true);
                checkboxHam.setSelected(true);
                checkboxBacon.setSelected(true);
            }
            case "Supreme" -> {
                checkboxPepperoni.setSelected(true);
                checkboxSausage.setSelected(true);
                checkboxHam.setSelected(true);
                checkboxMushroom.setSelected(true);
                checkboxBlackOlives.setSelected(true);
                checkboxGreenPeppers.setSelected(true);
                checkboxOnions.setSelected(true);
                checkboxTomato.setSelected(true);
                checkboxBacon.setSelected(true);
            }
            case "Hawaiian" -> {
                checkboxHam.setSelected(true);
                checkboxPineapple.setSelected(true);
            }
            case "Garden" -> {
                checkboxMushroom.setSelected(true);
                checkboxBlackOlives.setSelected(true);
                checkboxGreenPeppers.setSelected(true);
                checkboxOnions.setSelected(true);
                checkboxTomato.setSelected(true);
            }
        }
    }

    public void cancelAndDeleteItem() {
        Main.items.remove(this.pizza);
        Stage stage = (Stage) edit.getScene().getWindow();
        stage.close();
    }

    public void saveAndExit() {
        pizza.setSize(sizeDropdown.getSelectionModel().getSelectedItem());
        pizza.setCrust(crustDropdown.getSelectionModel().getSelectedItem());

        if (checkboxPepperoni.isSelected()) pizza.addTopping(Pizza.Topping.PEPPERONI);
        if (checkboxSausage.isSelected()) pizza.addTopping(Pizza.Topping.SAUSAGE);
        if (checkboxHam.isSelected()) pizza.addTopping(Pizza.Topping.HAM);
        if (checkboxMushroom.isSelected()) pizza.addTopping(Pizza.Topping.MUSHROOM);
        if (checkboxPineapple.isSelected()) pizza.addTopping(Pizza.Topping.PINEAPPLE);
        if (checkboxBlackOlives.isSelected()) pizza.addTopping(Pizza.Topping.BLACK_OLIVES);
        if (checkboxGreenPeppers.isSelected()) pizza.addTopping(Pizza.Topping.GREEN_PEPPERS);
        if (checkboxOnions.isSelected()) pizza.addTopping(Pizza.Topping.ONIONS);
        if (checkboxTomato.isSelected()) pizza.addTopping(Pizza.Topping.TOMATO);
        if (checkboxBacon.isSelected()) pizza.addTopping(Pizza.Topping.BACON);

        Stage stage = (Stage) edit.getScene().getWindow();
        stage.close();
    }
}