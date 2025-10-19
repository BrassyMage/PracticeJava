package RestaurantOrderingSystem;

public class Dessert extends MenuItem{
    private String isCold;

    public void setIsCold(String isCold) {
        this.isCold = isCold;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Dessert");
    }

    @Override
    public void displayInfo() {
        System.out.println("Dessert Info:");
        super.displayInfo();
        System.out.println("is Cold: " + isCold);
        System.out.println("------");
    }
}
