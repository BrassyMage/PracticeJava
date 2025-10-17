package coffeeShop;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Coffee coffee = new Coffee("Aya", "Extra Large", 150.12, "Bea");
        Coffee coffee1 = new Coffee("Sarah", "large", 3, "Kyle");
        Tea tea = new Tea("Bea", "Medium Rare", 150, "Matcha");

        order.addDrink(coffee1); //index 0
        order.addDrink(coffee); //index 1
        order.addDrink(tea); //index 2

        order.showOrder();
        order.prepareAll();

    }
}
