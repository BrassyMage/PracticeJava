package RestaurantOrderingSystem;

public class Drink extends MenuItem {
    private String size;

    public Drink(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }


}
