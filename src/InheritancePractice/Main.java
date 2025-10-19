package InheritancePractice;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("School: ");
        student.setSchool(scanner.next());

        System.out.print("Student ID: ");
        student.setStudentID(scanner.next());

        scanner.nextLine();
        System.out.print("First Name: ");
        student.setFirst_name(scanner.nextLine());

        System.out.print("Last Name: ");
        student.setLast_name(scanner.nextLine());

        System.out.print("Year Started: ");
        student.setYearStarted(scanner.nextInt());
        System.out.println();

        student.displayDetails();
        scanner.close();
    }
}
