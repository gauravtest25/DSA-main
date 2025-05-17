// // wap to insert  the element from given position in an array and display that array.
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Read the number of elements in the array

        // Step 2: Declare the array with extra space
        int[] arr = new int[n + 1]; // Create an array with one extra space to allow insertion

        // Step 3: Input the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Fill the array with user input
        }

        // Step 4: Input the position and element to insert
        System.out.print("Enter the position to insert (1 to " + (n + 1) + "): ");
        int pos = sc.nextInt(); // Read the position (1-based indexing)
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt(); // Read the element to be inserted

        // Step 5: Shift elements to the right to make space for the new element
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1]; // Move elements one position to the right
        }

        // Step 6: Insert the new element at the specified position
        arr[pos - 1] = element; // Insert the new element (adjusting for 0-based indexing)

        // Step 7: Display the updated array
        System.out.println("Updated array:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " "); // Print all elements of the updated array
            
        }
    }
}