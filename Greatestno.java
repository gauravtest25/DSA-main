import java.util.Scanner;

public class Greatestno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a=scanner.nextInt();
        System.out.print("Enter Second no: ");
        int b=scanner.nextInt();
        System.out.print("Enter Third no: ");
        int c=scanner.nextInt();
        scanner.close();

        if (a>b && a>c){
            System.out.println(a);
        }
            else if(b>c && b>a){
                System.err.println(b);
            }
            else{
                System.err.println(c);
            }
        }
    }

