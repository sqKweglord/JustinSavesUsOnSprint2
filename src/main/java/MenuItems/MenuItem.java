package MenuItems;

public class MenuItem {

    protected int itemID = 0;
    private static int nextItemID = 1;
    protected String itemName;


    public enum sizes {
        SMALL,
        MEDIUM,
        LARGE,
        X_LARGE
    }

    sizes size;

    public MenuItem(sizes size) {
        this.itemID = this.nextItemID;
        this.nextItemID++;
        this.size = size;
    }

    public int getItemID() {
        return this.itemID;
    }

    public String getItemName() {
        return this.itemName;
    }

    public sizes getSize() {
        return size;
    }

    public double getPrice() {
        return 0;
    }

    public void setItemName(String name) {
        itemName = name;
    }
}
