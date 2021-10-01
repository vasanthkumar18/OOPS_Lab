import java.io.*;
import java.lang.*;
import java.util.*;


public class Q3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String buffer=sc.nextLine();
		int arr[]=new int[n];
		String ele=sc.nextLine();
		String el[]=ele.split(" ");
		for(int i=0;i<n;i++)
		{
		    arr[i]=Integer.parseInt(el[i]);
		}
		String in=sc.nextLine();
		String inp[]=in.split(" ");
		int sum=0;
		for(int i=0;i<inp.length;i++)
		{
		    int j=Integer.parseInt(inp[i]);
		    try {
		        sum+=arr[j];
		    } catch(Exception e) 
		    {
		        System.out.println("ArrayIndexOutOfBoundsException. Enter valid index");
		        return;
		    }
		    
		}
		System.out.println(sum);
	}
	
}

