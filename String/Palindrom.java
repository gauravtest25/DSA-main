package String;

import java.util.*;
public class Palindrom
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        String reversed="";
        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
	}
}

// public class Main
// {
// 	public static void main(String[] args) {
// 		int i=0;
// 		int j=s.length()-1;
// 		while(i<j){
// 		    if(s.charAt(i)!=s.charAt(j)){
// 		        return false;
// 		        i++;
// 		        j--;
// 		    }
// 		    return true;
// 		}
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 		String s="hello";
// 		String reversed="";
// 		for(int i=s.length()-1 ; i>=0; i--){
// 		    reversed=reversed+s.charAt(i);
// 		}
// 		System.out.println(reversed);
		
// 	}
// }
