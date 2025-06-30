package Array;

public class Reversearr {
    public static void Reverse(int numbers[], int first, int last){
        int first=0; int last= numbers.length-1;
        while(first<last){
            int temp= numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;
            
            first++;
            last--; 
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        Reverse(numbers,2,5);
        Reverse(numbers,1,4);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}

