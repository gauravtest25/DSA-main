public class Butterfly {
    public static void Butter_fly(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
}
    }
    public static void main(String[] args) {
        Butter_fly(5);
    }
}
        