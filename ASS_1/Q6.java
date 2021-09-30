import java.io.*;
import java.lang.*;
import java.util.*;

public class Q6
{
   
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number");
		int n=sc.nextInt(); 
		String str=Integer.toString(n,10);
		int len=str.length();
		int j=len-1;
		for(int i=0;i<len/2;i++)
		{
		    if(str.charAt(i)!=str.charAt(j))
		    {
		        System.out.println("False");
		        return;
		    }
		    j--;
		    
		}
		System.out.println("True");
		

		
		
	}
}
