import java.io.*;
import java.lang.*;
import java.util.*;

class Customer
{
    String customerName;
    String accountNo;
    int currentBalance;
    Customer(String customerName, String accountNo, int currentBalance)
    {
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }
    public void availableBalance()
    {
        System.out.println(customerName+" "+currentBalance);
    }
}
class Silver extends Customer
{
    int interest=5;
    String membershipType="Silver";
    Silver(String customerName,String accountNo,int currentBalance)
    {
        super(customerName,accountNo,currentBalance);
    }
    public void availableBalance()
    {
        System.out.print(customerName+":"+currentBalance+":"+membershipType+":");
        currentBalance+=currentBalance*interest/100;
        System.out.println(currentBalance);
    }
}
class Gold extends Customer
{
    int interest=10;
    String membershipType="Gold";
    Gold(String customerName,String accountNo,int currentBalance)
    {
        super(customerName,accountNo,currentBalance);
    }
    public void availableBalance()
    {
        System.out.print(customerName+":"+currentBalance+":"+membershipType+":");
        currentBalance+=currentBalance*interest/100;
        System.out.println(currentBalance);
    }

}
class Platinum extends Customer
{
    int interest=15;
    String membershipType="Platinum";
    Platinum(String customerName,String accountNo,int currentBalance)
    {
        super(customerName,accountNo,currentBalance);
    }
    public void availableBalance()
    {
        System.out.print(customerName+":"+currentBalance+":"+membershipType+":");
        currentBalance+=currentBalance*interest/100;
        System.out.println(currentBalance);
    }

}
public class Q4
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    int k=sc.nextInt();
	    String buffer=sc.nextLine();
	    ArrayList<Customer> arr=new ArrayList<>();
	    while(k!=0)
	    {
	        String inp=sc.nextLine();
	        String ip[]=inp.split(":");
	        
	        String customerName=ip[0];
	        String accountNo=ip[1];
	        int currentBalance=Integer.parseInt(ip[2]);
	        
	        if(currentBalance<100000)
	        {
	            Customer member=new Silver(customerName,accountNo,currentBalance);
	            arr.add(member);
	        }
	        else if(currentBalance<1000000)
	        {
	            Customer member=new Gold(customerName,accountNo,currentBalance);
	            arr.add(member);
	            
	        }
	        else
	        {
	            Customer member=new Platinum(customerName,accountNo,currentBalance);
	            arr.add(member);
	        }
	        k--;
	        
	    }
	    for(Customer mem:arr)
	    {
	        mem.availableBalance();
	    }
	    
	}
	
}

