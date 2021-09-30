import java.io.*;
import java.lang.*;
import java.util.*;


class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

class Square extends Rectangle
{
    Square(int a)
    {
        super(a,a);
    }
    
}

public class Q3
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String inp=sc.nextLine();
	    String input[]=inp.split(" ");
	    if(input.length==2)
	    {
	        Rectangle r=new Rectangle(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
	        System.out.println("Rectangle Perimeter: "+r.perimeter());
	        System.out.println("Rectangle Area: "+r.area());
	    }
	    else
	    {
	        Square s=new Square(Integer.parseInt(input[0]));
	        System.out.println("Square Perimeter: "+s.perimeter());
	        System.out.println("Square Area: "+s.area());
	    }
	    
	}
}

