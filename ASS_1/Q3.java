import java.io.*;
import java.lang.*;
import java.util.*;

public class Q3
{
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number");
		long a=sc.nextInt(); 
		int count=0;
		while(a!=0)
		{
		    count++;
		    a=a/10;
		}
		System.out.println("The number of digits: "+count);

		
		
	}
}
