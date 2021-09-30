import java.io.*;
import java.lang.*;
import java.util.*;


class Bank
{
    int rateOfInterest;
    
    public void findInterest(int x)
    {
        // this method will be overridden : Run time polymorphism
        System.out.println("This is bank\nFinding your Interest");
    }
}
class SBI extends Bank
{
    int rateOfInterest=5;
    public void findInterest(int x)
    {
        float interest;
        interest=(float)(x*rateOfInterest)/(float)100;
        System.out.println("SBI Interest is "+interest);
    }
}
class ICICI extends Bank
{
    int rateOfInterest=6;
    public void findInterest(int x)
    {
        float interest;
        interest=(float)(x*rateOfInterest)/(float)100;
        System.out.println("ICICI Interest is "+interest);
    } 
}
class AXIS extends Bank
{
    int rateOfInterest=7;
    public void findInterest(int x)
    {
        float interest;
        interest=(float)(x*rateOfInterest)/(float)100;
        System.out.println("AXIS Interest is "+interest);
    }
}
public class Q2
{
	public static void main(String[] args) 
	{
	    System.out.print("X: ");
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    
	    SBI sbi=new SBI();
	    sbi.findInterest(x);
	    
	    ICICI icici=new ICICI();
	    icici.findInterest(x);
	    
	    AXIS axis=new AXIS();
	    axis.findInterest(x);
	    
	    

	   
	    
	}
}

