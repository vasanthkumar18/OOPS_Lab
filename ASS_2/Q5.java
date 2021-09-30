import java.io.*;
import java.lang.*;
import java.util.*;

public class Q5
{
   
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the inmate details:");
		String input=sc.nextLine();
		System.out.println("Enter the number of days:");
		int days=sc.nextInt();
		String arr[]=input.split(" ");
		
		
		System.out.println("Total Bill");
		
		int cost=0;
		if(arr[2].equals("nonveg")) 
		{
		    cost=120;
		}
		else if(arr[2].equals("veg"))
		{
		    cost=100;
		}
		else 
		{
		    System.out.println("Wrong input");
		    System.exit(1);
		}
		int money=days*cost;
		
		int additionalcharge=0;
		if(arr[1].equals("employee"))
		{
		   additionalcharge=(5*money)/100;
		}
		else if(arr[1].equals("student"))
		{
		   additionalcharge=0;
		}
		else
		{
		    System.out.println("Wrong input");
		    System.exit(1);
		}
	    System.out.println(money+additionalcharge);
	}
		
}
