package coffeeShop;

import java.util.ArrayList;

public class Order {

   private ArrayList<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void showOrder(){
        System.out.println("---Order Info---");
        for(Drink drink : drinks){
            drink.displayInfo();
            System.out.println();
        }
    }

    public void prepareAll(){
        System.out.println("-------");
        System.out.println("Preparing All Drinks");
        for(Drink drink : drinks){
            drink.prepare();
            System.out.println();
        }
    }
}
