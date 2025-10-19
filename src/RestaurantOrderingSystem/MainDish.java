package RestaurantOrderingSystem;

public class MainDish extends MenuItem{
    private String mainIngredient;

    public MainDish(String name, double price, String mainIngredient) {
        super(name, price);
        this.mainIngredient = mainIngredient;
    }
    public String getMainIngredient() {
        return mainIngredient;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Main Dish");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Main Dish Ingredient: "+mainIngredient);
    }
}

