import java.io.*;
import java.lang.*;
import java.util.*;


public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		long p;
		try {
		    p=Long.parseLong(in,16);
		    System.out.println(p);
		} catch(Exception e) 
		{
		    System.out.println("InvalidHexadecimal");
		} 
	}
	
}

