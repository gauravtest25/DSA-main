import java.util.Scanner;

public class Circlearea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius=scanner.nextDouble();
        scanner.close();

        double area=Math.PI*radius*radius;

        System.out.println("Area of Circle is:"+area);
    }
}
