package coffeeShop;

public class Coffee extends Drink{
    private String type;

    public Coffee(String name, String size, double price, String type){
        super(name, size, price);
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("Brewing coffee grounds and adding milk or water.");
        System.out.println("Order for "+getName());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}
