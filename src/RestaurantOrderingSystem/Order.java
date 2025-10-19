package RestaurantOrderingSystem;
import java.util.ArrayList;

public class Order {
    private final ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void showOrder() {
        System.out.println("\n===== ORDER DETAILS =====");
        for (MenuItem item : items) {
            item.displayInfo();
        }
        System.out.println("==========================");
    }

    public void prepareALl() {
        System.out.println("\nPreparing all items...");
        for (MenuItem item : items) {
            item.prepare();
        }
    }

    public void calculateTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        System.out.println("\nTotal Price: ₱" + total);
    }
}

