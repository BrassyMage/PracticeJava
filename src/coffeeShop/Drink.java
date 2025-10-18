package coffeeShop;

public abstract class Drink {
    private String name;
    private String size;
    private double price;

    public Drink(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public String getSize() {

        return size;
    }

    public double getPrice() {

        return price;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    abstract void prepare();

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}
