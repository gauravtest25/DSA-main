public class Average {
    public static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double avg = computeAverage(10, 20, 30);
        System.out.println("Average: " + avg);
    }
}
