package polymorphismQuiz;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle circ = new Circle();

        System.out.print("Shape(R/S/C): ");
        char shape = scanner.next().toUpperCase().charAt(0);

        switch (shape) {
            case 'R':
                System.out.print("Length: ");
                rec.setLength(scanner.nextDouble());
                System.out.print("Width: ");
                rec.setWidth(scanner.nextDouble());

                System.out.println();
                System.out.printf("Area: %.2f\n", rec.getArea());
                System.out.printf("Perimeter: %.2f",rec.getPerimeter());
                break;

            case 'S':
                System.out.print("Side: ");
                sq.setSide(scanner.nextDouble());

                System.out.println();
                System.out.printf("Area: %.2f\n" , sq.getArea());
                System.out.printf("Circumference: %.2f ",sq.getPerimeter());
                break;

                case 'C':
                    System.out.print("Radius: ");
                    circ.setRadius(scanner.nextDouble());
                    System.out.println();
                    System.out.printf("Area: %.2f\n" , circ.getArea());
                    System.out.printf("Circumference: %.2f ",circ.getPerimeter());
                    break;

        }

        scanner.close();
    }
}
