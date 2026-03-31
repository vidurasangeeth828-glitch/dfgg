public class Item {
    String itemId;
    String itemName;
    int quantity;
    double price;

    public Item(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    
    public String toString() {
        return itemId + " - " + itemName + " | Qty: " + quantity + " | $" + price;
    }
}