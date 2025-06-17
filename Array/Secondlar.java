package Array;

public class Secondlar {
    public static void getLargest(int arr[]){
       int fmax=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        if(arr[i]>fmax){
            smax=fmax;
            fmax=arr[i];
        }
        else if(arr[i]>smax){
            smax=arr[i];
        }
       }
       System.out.print("Smallest:"+smax+"Largest:"+fmax);
    }
    public static void main(String[] args) {
      int arr[]={1,2,6,4,3,5};
      getLargest(arr);
    }
}
