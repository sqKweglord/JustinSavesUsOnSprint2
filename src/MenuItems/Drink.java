package MenuItems;

public class Drink extends MenuItem {

    private sizes size;

    public Drink(String name, MenuItem.sizes size) {
        super(size);
        this.itemName = name;
    }

    public MenuItem.sizes getSize() {
        return this.size;
    }

}
