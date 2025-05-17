public class Evencheck {
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        int testNumber=10;
        if(isEven(testNumber)){
            System.out.println(testNumber + " is Even");
        }
        else{
            System.out.println(testNumber + " is odd");
        }
    }
}
