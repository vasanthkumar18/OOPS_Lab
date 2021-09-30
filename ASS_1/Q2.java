import java.io.*;
import java.lang.*;
import java.util.*;

public class Q2
{
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		long a=sc.nextInt(); 
		System.out.println("Enter the value of b");
		long b=sc.nextInt(); 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"\nb="+b);
		
	}
}
