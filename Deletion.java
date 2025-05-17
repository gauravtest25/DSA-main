// wap to delete the element from given position in an array and display that array.

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Taking array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Taking the position of the element to delete from the user
        System.out.print("Enter the position to delete element (0-based index): ");
        int pos = sc.nextInt();

        // Check for a valid position
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the left to fill the gap
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Display the updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}