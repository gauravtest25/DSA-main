public class Invertedpyramid {
    public static void invertedPyramid(int n) {
        for (int i = 1; i<=n; i++) {
            // Print leading spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        invertedPyramid(10);
    }
}