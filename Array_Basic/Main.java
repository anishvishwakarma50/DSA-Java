import java.util.Scanner;
import java.util.Arrays; // Required for Arrays.toString()

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the desired size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // 2. Declare and initialize the array with the specified size
        int[] array = new int[size];

        // 3. Use a for loop to get each element of the array as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 4. (Optional) Print the array to verify the input
        System.out.println("The entered array is: " + Arrays.toString(array));

        // 5. Close the scanner object (good practice)
        scanner.close();
    }
}
