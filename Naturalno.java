import java.util.Scanner;

public class Naturalno {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter a number");
      int a=scanner.nextInt();
      scanner.close();
      int sum=0;
      for(int i=1; i<=a; i++){
        sum=sum+i;
      }
      System.err.println(sum);
    }
}
