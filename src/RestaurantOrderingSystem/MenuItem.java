package RestaurantOrderingSystem;

public abstract class MenuItem {
    private String name;
    private double price;


     abstract void prepare();

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
