import java.util.Scanner;

public class Averagescore {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double sum=0;

        System.out.println("Enter 25 exam score: ");

        for(int i=1; i<=25; i++){
            System.out.print("score"+i+": ");
            double score=scanner.nextDouble();
            sum=sum+score;
        }
        System.out.println("Average score: " + (sum / 25));

        scanner.close();
    }
}
