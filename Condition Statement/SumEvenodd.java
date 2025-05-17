import java.util.Scanner;

public class SumEvenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        
        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
    }
} 