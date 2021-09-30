import java.io.*;
import java.lang.*;
import java.util.*;

class Solve
{
    public void area(int r)
    {
        
        double area=0;
        double pi=3.14159;
        area=pi*r*r;
        System.out.print("Circle: ");
        System.out.printf("%.2f",area);
    }
    public void area(int a, int b)
    {
        float area=a*b;
        System.out.print("Rectangle: ");
        System.out.printf("%.2f",area);
    }
    
    public void area(int a, int b, int c)
    {
        float s=(float)(a+b+c)/(float)2.0;
        float area=s*(s-a)*(s-b)*(s-c);
        area=(float)Math.sqrt(area);
        System.out.print("Traingle: ");
        System.out.printf("%.2f",area);
    }
}
public class Q2
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    String inp=sc.nextLine();
	    String ip[]=inp.split(" ");
	    Solve solve=new Solve();
	    if(ip.length==1)
	    {
	        solve.area(Integer.parseInt(ip[0]));
	    }
	    else if(ip.length==2)
	    {
	        solve.area(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]));

	    }
	    else
	    {
	        solve.area(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]),Integer.parseInt(ip[2]));
	    }
	}
}

