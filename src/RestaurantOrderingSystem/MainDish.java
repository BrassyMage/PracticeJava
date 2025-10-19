package RestaurantOrderingSystem;

public class MainDish extends MenuItem{
    private String mainIngredient;

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing Main Dish");
    }

    @Override
    public void displayInfo(){
        System.out.println("Main Dish Info:");
        super.displayInfo();
        System.out.println("Main Dish Ingredient: "+mainIngredient);
        System.out.println("-------");
    }
}

