package Array.GFG;

public class Secondlargest {
    public int getSecondLargest(int[] arr) {
        int largest=-1;
        int second_largest=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
        return second_largest;
        
     }
     public static void main(String[] args){
        Secondlargest sol= new Secondlargest();
         int[] arr1={12,35,1,10,34,1};
         System.out.println(sol.getSecondLargest(arr1));
         int[] arr2={10,5,10};
         System.out.println(sol.getSecondLargest(arr2));
         int[] arr3={10,10,10};
         System.out.println(sol.getSecondLargest(arr3));
     }
}
