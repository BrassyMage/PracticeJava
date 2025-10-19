package RestaurantOrderingSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        MainDish main = new MainDish();
        Dessert dess = new Dessert();
        Drink drink = new Drink();

        System.out.println("Input your order:");
        System.out.print("Enter the Main Dish name: ");
        main.setName(scanner.nextLine());
        System.out.print("Enter the Main Dish ingredient: ");
        main.setMainIngredient(scanner.next());
        System.out.print("Enter the Main Dish price: ");
        main.setPrice(scanner.nextDouble());
        System.out.println();

        System.out.print("Enter the Dessert name: ");
        dess.setName(scanner.next());
        System.out.print("Is the dessert cold?: ");
        dess.setIsCold(scanner.next());
        System.out.print("Enter the Dessert price: ");
        dess.setPrice(scanner.nextDouble());
        System.out.println();

        System.out.print("Enter the Drink name: ");
        drink.setName(scanner.next());
        System.out.print("What size is the drink?: ");
        drink.setSize(scanner.next());
        System.out.print("Enter the Drink price: ");
        drink.setPrice(scanner.nextDouble());
        System.out.println();

        order.addItem(main);
        order.addItem(dess);
        order.addItem(drink);
        order.showOrder();
        order.prepareALl();
        order.calculateTotalPrice();

        scanner.close();
    }
}
