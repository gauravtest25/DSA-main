package Array;

public class InsertElement
{
    public static void main(String[] args) {
	    int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;         // Index where to insert
        int newElement = 99;  
        
        // Create new Array
        int newarr[]=new int[arr.length+1];
        
        // value before pos
        for(int i=0 ;i<pos; i++){
            newarr[i]=arr[i];
        }
        
            newarr[pos]=newElement;
            
            for(int i=pos+1; i<newarr.length; i++){
                newarr[i]=arr[i-1];
            }
            
            for(int num : newarr){
                System.out.print(num+ " ");
            }
            
        }	 
}
