package Array;

public class Maxsum {
    public static void maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // add current element to sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 4, -2, 1};
        maxSubarraySum(arr);
    }
}
