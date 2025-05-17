import java.util.Scanner;

public class Copiedstring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=ob.nextLine();
	    // String str=new String("Hello Java");
	    String str1=new String("");
        String str3=new String( "Developer");
        ob.close();
        str3=str+str3;
	    str1=str;
	    int i =0;
	    for(i=0;i<str.length();i++)
	    {       
	       
	    }
	    System.out.println("Copied string="+str1);
	    if(str1==str)
	    {
            System.out.println("Lenth of Copied String="+i);
	    }
        System.out.println("Append String:"+str3);
	    
	}
 }

