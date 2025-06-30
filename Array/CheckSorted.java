package Array;

public class CheckSorted { 
    public static boolean isSorted(int[] arr) { 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < arr[i - 1]) { 
                return false; // If any element is smaller than the previous, it's unsorted 
            } 
        } 
        return true; 
    } 

    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5}; 
        System.out.println("Is Sorted: " + isSorted(arr)); 
    } 
}


