package Array;

public class Twosum {
    public static int[] twosum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans; // Return as soon as the pair is found
                }
            }
        }
        return null; // Return null if no pair is found
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int target = 3;

        int[] result = twosum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found.");
        }
    }
}
