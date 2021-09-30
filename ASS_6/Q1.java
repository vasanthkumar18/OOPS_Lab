import java.io.*;
import java.lang.*;
import java.util.*;

interface CreditCard
{
    
    int convertRupees(int rupee);
    int convertDollars(int dollars);
    int convertPounds(int pounds);
}

class Bank implements CreditCard
{
    int totalBalance;
    Bank(int totalBalance)
    {
        this.totalBalance=totalBalance;
    }
    
    public int convertRupees(int rupee)
    {
        totalBalance=totalBalance-rupee;
        return totalBalance;
    }
    
    public int convertDollars(int dollars)
    {
        int money=dollars*70;
        totalBalance=totalBalance-money;
        return totalBalance;
    }
    
    public int convertPounds(int pounds)
    {
        int money=pounds*100;
        totalBalance=totalBalance-money;
        return totalBalance;
    }
}

public class Q1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int totalBalance=sc.nextInt();
		
		int rupee=sc.nextInt();
		int dollars=sc.nextInt();
		int pounds=sc.nextInt();
		
	    Bank cc=new Bank(totalBalance);
		if(cc.convertRupees(rupee)<0)
		{
		    System.out.println("Insufficient balance");
		}
		if(cc.convertDollars(dollars)<0)
		{
		    System.out.println("Insufficient balance");
		}
		if(cc.convertPounds(pounds)<0)
		{
		    System.out.println("Insufficient balance");
		}
		else
		{
		    System.out.println(cc.totalBalance);
		}
		
	}
}

