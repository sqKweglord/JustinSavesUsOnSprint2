package MenuItems;

public class Side extends MenuItem {

    private String description;

    public Side(String name, MenuItem.sizes size) {
        super(size);
        this.itemName = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
