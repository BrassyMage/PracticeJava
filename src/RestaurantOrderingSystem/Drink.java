package RestaurantOrderingSystem;

public class Drink extends MenuItem {
    private String size;

    public void setSize(String size) {
        this.size=size;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Drink");
    }

    @Override
    public void displayInfo() {
        System.out.println("Drink Info:");
        super.displayInfo();
        System.out.println("Size of Drink is: " + size);
    }


}
