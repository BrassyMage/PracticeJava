package arraySortJava;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Enter value at array index %d: ",i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("The unsorted values of array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The sorted values of array:");
        for (int i = 0; i < size; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }
        System.out.printf("\nThe sum of the values is: %d",sum);

        int lowest = arr[0];
        int highest = arr[arr.length - 1];
        System.out.println();
        System.out.println("The highest element of the array is: " + highest);
        System.out.println("The lowest element of the array is: " + lowest);

        scanner.close();
    }
}
