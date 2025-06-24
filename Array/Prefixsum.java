package Array;

public class Prefixsum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0]; // First element stays the same

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // Add previous prefix to current element
        }

        // Print prefix sum array
        System.out.print("Prefix Sum: ");
        for (int val : prefix) {
            System.out.print(val + " ");
        }
    }
}

