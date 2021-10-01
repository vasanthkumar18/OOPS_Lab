import java.io.*;
import java.lang.*;
import java.util.*;


public class Q1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char in1;
		int in2;
		int in3;
		try{
		in1=sc.nextLine().charAt(0);
		}
		catch(Exception e)
		{
		    System.out.println("The input isn't required Operator");
		    return;
		}
		try{
		    in2=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
		    System.out.println("Your input isn't proper Integer");
		    return;
		}
		try{
		    in3=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
		    System.out.println("Your input isn't proper Integer");
		    return;
		}
	    if(in1=='+')
	    {
	        System.out.println(in2+in3);
	    }
	    else if(in1=='-')
	    {
	        System.out.println(in2-in3);
	    }
	    else if(in1=='*')
	    {
	        System.out.println(in2*in3);
	    }
	    else if(in1=='/')
	    {
	        int ans;
	        try{
	            ans=in2/in3;
	        }
	        catch(Exception e)
	        {
	            System.out.println(e+"Enter valid argument");
	            return;
	        }
	        System.out.println(in2/in3);
	    }
	    else{
	        System.out.println("The input isn't required Operator");
	    }
	}
}

