package coffeeShop;

public class Tea extends Drink{
    private String flavor;

    public Tea(String name, String size, double price,String flavor){
        super(name, size, price);
        this.flavor = flavor;
    }

    @Override
    public void prepare() {
        System.out.println("Steeping tea leaves in hot water.");
        System.out.println("Order for "+getName());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flavor: " + flavor);
    }
}


