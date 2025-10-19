package RestaurantOrderingSystem;

public class Dessert extends MenuItem{
    private String isCold;

    public Dessert(String name, double price, String isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    public String getIsCold() {
        return isCold;
    }
    public void setIsCold(String isCold) {
        this.isCold = isCold;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Dessert");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("isCold: " + isCold);
    }
}
