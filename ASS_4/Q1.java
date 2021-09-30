import java.io.*;
import java.lang.*;
import java.util.*;

class Solve
{
    public int And(int a, int b)
    {
        return (a&b);
    }
    
    public int And(int a, int b, int c)
    {
        return ((a&b)&c);
    }
}
public class Q1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    String inp=sc.nextLine();
	    String ip[]=inp.split(" ");
	    Solve solve=new Solve();
	    if(ip.length==2)
	    {
	        int ans=solve.And(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]));
	        System.out.println(ans);

	    }
	    else
	    {
	        int ans=solve.And(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]),Integer.parseInt(ip[2]));
    	    System.out.println(ans);
	    }
	}
}

