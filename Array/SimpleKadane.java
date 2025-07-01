package Array;
public class SimpleKadane {
    public static void main(String[] args) {
        int[] arr = {2, -1, 4, -2, 1};

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum < 0) {
                sum = 0; // Treat negative sum as 0
            }

            if (sum > max) {
                max = sum; // Update max
            }
        }

        System.out.println("Maximum Subarray Sum is: " + max);
    }
}
