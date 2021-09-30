import java.io.*;
import java.lang.*;
import java.util.*;


abstract class Addition
{
    abstract void add();
}

class IntegerAddition extends Addition
{
    int a,b;
    IntegerAddition(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        System.out.println(a+b);
    }
}

class FractionAddition extends Addition
{
    int num1,den1,num2,den2;
    FractionAddition(int num1, int den1, int num2, int den2)
    {
        this.num1=num1;
        this.den1=den1;
        this.num2=num2;
        this.den2=den2;
    }
    
    public int gcd(int a, int b)
    {
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    
    void add()
    {
        
        int a=num1*den2+num2*den1;
        int b=den1*den2;
        while(gcd(a,b)!=1)
        {
            
            int k=gcd(a,b);
            a=a/k;
            b=b/k;
        }
        System.out.println(a+"/"+b);
        
    }
}
public class Q4
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String inp=sc.nextLine();
	    String input[]=inp.split(" ");
	    if(input.length==2)
	    {
	        IntegerAddition a=new IntegerAddition(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
	        a.add();
	    }
	    else
	    {
	        FractionAddition b=new FractionAddition(Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]),Integer.parseInt(input[3]));
	        b.add();
	    }
	    
	}
}

