package EncapsulationPractice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.print("Enter game name: ");
        game.setName(scanner.next());

        System.out.print("Enter year published: ");
        game.setYearPublished(scanner.nextInt());

        System.out.print("Enter game publisher: ");
        game.setPublisher(scanner.next());

        System.out.println(game.getName() + " is published on " + game.getYearPublished() + " by " + game.getPublisher());

        scanner.close();
    }
}
