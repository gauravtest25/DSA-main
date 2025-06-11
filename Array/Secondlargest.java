package Array;
public class Secondlargest {
    public static int second(int numbers[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
    if(numbers[0]>numbers[1]){
     max1=numbers[0];
     max2=numbers[1];
    }
    else{
        max2=numbers[1];
        max1=numbers[0];
    }
    for(int i=2; i<numbers.length; i++){
        if(numbers[i]>max1){
            max2=max1;
            max1=numbers[i];
    }
    else if(numbers[i]>max2){
            max2=numbers[i];
    }
 }
 return max2;
}
   public static void main(String[] args) {
    int numbers[]={25,20,53,63,10,20,50};
    System.out.println(second(numbers));
   } 
}
