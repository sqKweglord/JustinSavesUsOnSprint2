package MenuItems;

import com.example.Sprint2.Main;
import com.example.Sprint2.PizzaCustomizer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Pizza extends MenuItem {


    public enum Crust {
        THIN,
        HAND_TOSSED,
        PAN
    }

    public enum Topping {
        PEPPERONI,
        SAUSAGE,
        HAM,
        MUSHROOM,
        PINEAPPLE,
        BLACK_OLIVES,
        GREEN_PEPPERS,
        ONIONS,
        TOMATO,
        BACON
    }

    private ArrayList<Topping> toppings = new ArrayList<>();
    private Crust crust;

    public Pizza(String name, sizes size) {
        super(size);
        itemName = name;
        openCustomizer();
    }

    private void openCustomizer() {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("pizza.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            PizzaCustomizer controller = fxmlLoader.getController();
            controller.init(this);
            stage.setTitle("Pizza");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //handles adding, removing, an returning toppings
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addTopping(String string) {
        addTopping(getTopping(string));
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public void removeTopping(String string) {
        removeTopping(getTopping(string));
    }

    public Topping getTopping(String string) {

        switch (string) {
            case "Pepperoni" -> { return Topping.PEPPERONI; }
            case "Sausage" -> { return Topping.SAUSAGE; }
            case "Ham" -> { return Topping.HAM; }
            case "Mushroom" -> { return Topping.MUSHROOM; }
            case "Pineapple" -> { return Topping.PINEAPPLE; }
            case "Black Olives" -> { return Topping.BLACK_OLIVES; }
            case "Green Peppers" -> { return Topping.GREEN_PEPPERS; }
            case "Onions" -> { return Topping.ONIONS; }
            case "Tomato" -> { return Topping.TOMATO; }
            case "Bacon" -> { return Topping.BACON; }
        }

        return null;
    }

    public void setSize(sizes size) {
        this.size = size;
    }

    public void setSize(String string) {
        switch (string) {
            case "10-inch" -> setSize(sizes.SMALL);
            default -> setSize(sizes.MEDIUM);
            case "14-inch" -> setSize(sizes.LARGE);
            case "16-inch" -> setSize(sizes.X_LARGE);
        }
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void setCrust(String string) {
        switch (string) {
            default -> setCrust(Crust.THIN);
            case "Hand Tossed" -> setCrust(Crust.HAND_TOSSED);
            case "Pan Crust" -> setCrust(Crust.PAN);
        }
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    //prints all details of the pizza
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append("Pizza: ").append(itemName).append("\n");
        msg.append("Size: ").append(size).append("\n");
        msg.append("Toppings: \n");
        for (Topping top : toppings) {
            msg.append(top).append("\n");
        }
        return msg.toString();
    }

    @Override
    public double getPrice() {
        return 10 + (double)toppings.size();
    }
}
