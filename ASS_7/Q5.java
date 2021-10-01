import java.io.*;
import java.lang.*;
import java.util.*;



public class Q5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		String inp[]=in.split(" ");
		int a=Integer.parseInt(inp[0]);
		int b=Integer.parseInt(inp[1]);
		int q=Integer.parseInt(sc.nextLine());
		int test=0;
		while(test!=q)
		{
		    String in2=sc.nextLine();
		    String inp2[]=in2.split(" ");
		    int n;
		    try 
		    {
		        n=Integer.parseInt(inp2[1]);
		    } 
		    catch(Exception e) 
		    {
		        System.out.println("Invalid number of Steps");
		        return;
		    } 
		    if(inp2[0].equals("Up") || inp2[0].equals("up"))
		    {
		        a=a-n;
		        if(a<0 || a>8)
		        {
		            System.out.println("Overflow");
		            return;
		        }
		    }
		    else if(inp2[0].equals("Right")|| inp2[0].equals("right"))
		    {
		        b=b+n;
		        if(b<0 || b>8)
		        {
		            System.out.println("Overflow");
		            return;
		        }
		    }
		    else if(inp2[0].equals("Down")||inp2[0].equals("down"))
		    {
		        a=a+n;
		        if(a<0 || a>8)
		        {
		            System.out.println("Overflow");
		            return;
		        }
		    }
		    else if(inp2[0].equals("Left")||inp2[0].equals("left"))
		    {
		        b=b-n;
		        if(b<0 || b>8)
		        {
		            System.out.println("Overflow");
		            return;
		        }
		    }
		    else
		    {
		        System.out.println("Wrong Movement");
		        return;
		    }
		    test++;
		}
		System.out.println("["+a+","+b+"]");
	}
	
}

