import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added!");
    }

    public void removeItem(String id) {
        for (Item i : items) {
            if (i.itemId.equals(id)) {
                items.remove(i);
                System.out.println("Item removed!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void updateQuantity(String id, int qty) {
        for (Item i : items) {
            if (i.itemId.equals(id)) {
                i.quantity = qty;
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory Items:");
            for (Item i : items) {
                System.out.println(i);
            }
        }
    }

    public void searchItem(String keyword) {
        for (Item i : items) {
            if (i.itemId.equals(keyword) || i.itemName.equalsIgnoreCase(keyword)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Item not found.");
    }
}