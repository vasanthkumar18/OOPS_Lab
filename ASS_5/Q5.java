import java.io.*;
import java.lang.*;
import java.util.*;


abstract class Student
{
    abstract int getFeeDetails();
    abstract void setFeeDetails(int fee);
    
}

class Undergraduate extends Student
{
    int fee=0;
    void setFeeDetails(int fee)
    {
        this.fee=fee;
    }
    int getFeeDetails()
    {
        return fee;
    }
}

class Postgraduate extends Student
{
    int fee=0;
    void setFeeDetails(int fee)
    {
        this.fee=fee;
    }
    int getFeeDetails()
    {
        return fee;
    }
}



public class Q5
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int UndergraduateFee=sc.nextInt();
	    int PostgraduateFee=sc.nextInt();
	    
	    // set Undergraduate fee
	    Undergraduate ug=new Undergraduate();
	    ug.setFeeDetails(UndergraduateFee);
	    
	    // set Postgraduate fee 
	    Postgraduate pg=new Postgraduate();
	    pg.setFeeDetails(PostgraduateFee);

        // total students 
	    int totalNumberOfStudents=sc.nextInt();
	    String buffer=sc.nextLine();
	    
	    
	    HashMap<String,Integer> hm=new HashMap<>();
	    while(totalNumberOfStudents!=0)
	    {
	        String inp=sc.nextLine();
	        String input[]=inp.split(" ");
	        
	        if(input[2].equals("UG"))
	        {
	            hm.put(input[1],ug.getFeeDetails());
	        }
	        else
	        {
	            hm.put(input[1],pg.getFeeDetails());
	        }
	        totalNumberOfStudents--;
	    }
	    
	    String roll=sc.next();
	    if(hm.get(roll)==null)
	    {
	        System.out.println("-1");
	        return;
	    }
	    System.out.println(hm.get(roll));
	    
	    
	    
	}
}

