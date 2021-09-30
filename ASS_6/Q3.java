import java.io.*;
import java.lang.*;
import java.util.*;


interface ShapeArea
{
    void area(int x);
}

class Circle implements ShapeArea
{
    public void area(int radius)
    {
        float pi=3.14f;
        System.out.println(pi*radius*radius);
    }
}

class Square implements ShapeArea
{
    public void area(int length)
    {
        System.out.println(length*length);
    }
}



public class Q3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String nameOfShape=sc.next();
		int x=sc.nextInt();
		if(nameOfShape.equals("Circle"))
		{
		    Circle shape=new Circle();
		    shape.area(x);
		}
		else
		{
		    Square shape=new Square();
		    shape.area(x);
		}
		
	}
	
}

