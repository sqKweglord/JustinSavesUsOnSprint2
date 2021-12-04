package MenuItems;

import com.example.justinsavesusonsprint2.DrinkCustomizer;
import com.example.justinsavesusonsprint2.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Drink extends MenuItem {

    public enum Type {
        PEPSI,
        DIET_PEPSI,
        SIERRA_MIST,
        CHEERWINE,
        MOUNTAIN_DEW
    }

    private Type type;
    private sizes size;

    public Drink(String name, MenuItem.sizes size) {
        super(size);
        this.itemName = name;
        openCustomizer();
    }

    private void openCustomizer() {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("drink.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            DrinkCustomizer controller = fxmlLoader.getController();
            controller.init(this);
            stage.setTitle("Drink");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MenuItem.sizes getSize() {
        return this.size;
    }

    public void setSize(sizes size) {
        this.size = size;
    }

    public void setSize(String string) {
        switch (string) {
            case "20-Ounce" -> setSize(sizes.SMALL);
            case "1-Liter" -> setSize(sizes.MEDIUM);
            case "2-Liter" -> setSize(sizes.LARGE);
        }
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setType(String string) {
        switch (string) {
            case "Pepsi" -> setType(Type.PEPSI);
            case "Diet Pepsi" -> setType(Type.DIET_PEPSI);
            case "Sierra Mist" -> setType(Type.SIERRA_MIST);
            case "Cheerwine" -> setType(Type.CHEERWINE);
            case "Mountain Dew" -> setType(Type.MOUNTAIN_DEW);
        }
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type=" + type + "\n" +
                ", size=" + size + "\n" +
                ", itemID=" + itemID + "\n" +
                ", itemName='" + itemName + '\'' + "\n" +
                ", size=" + size +
                '}';
    }
}
