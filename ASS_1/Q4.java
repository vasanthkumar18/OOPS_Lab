import java.io.*;
import java.lang.*;
import java.util.*;

public class Q4
{
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long a=sc.nextInt(); 
		long b=0;
		while(a!=0)
		{
		    long k=a%10;
		    b=b*10+k;
		    a=a/10;
		}
	    	a=b;
	    	System.out.println("Reverse = "+a);

		
		
	}
}
