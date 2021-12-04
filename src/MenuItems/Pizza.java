package MenuItems;

import java.util.ArrayList;

public class Pizza extends MenuItem {

    private String cheese;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<>();

    public Pizza(String name, sizes size) {
        super(size);
        itemName = name;
    }

    //getters and setters for cheese and sauce
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    //handles adding, removing, an returning toppings
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void removeTopping(String topping) {
        toppings.remove(topping);
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    //prints all details of the pizza
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append("Pizza ").append("ID: ").append(itemID).append("\n");
        msg.append("Name: ").append(itemName).append("\n");
        msg.append("Size: ").append(size).append("\n");
        msg.append("Cheese: ").append(cheese).append("\n");
        msg.append("Sauce: ").append(sauce).append("\n");
        msg.append("Toppings: ").append(toppings).append("\n");
        return msg.toString();
    }
}
