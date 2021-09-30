import java.io.*;
import java.lang.*;
import java.util.*;


interface HDFC
{
    void  transaction(String bankName, int customerAmount, int productPrice, LinkedList<Money> p);
}

interface ICICI
{
    void  transaction(String bankName, int customerAmount, int productPrice, LinkedList<Money> p);
}

class Money
{
    int flipkartBalance;
    int remainingBalance;
}

class Flipkart implements HDFC,ICICI
{
    static int flipkartBalance=0;
    public void transaction(String bankName, int customerAmount, int productPrice, LinkedList<Money> p)
    {
        if(bankName.equals("HDFC"))
        {
            int remainingBalance=customerAmount-productPrice;
            flipkartBalance+=productPrice;
            Money m=new Money();
            m.flipkartBalance=flipkartBalance;
            m.remainingBalance=remainingBalance;
            p.add(m);
        }
        else
        {
            int remainingBalance=customerAmount-productPrice;
            flipkartBalance+=productPrice;
            
            Money m=new Money();
            m.flipkartBalance=flipkartBalance;
            m.remainingBalance=remainingBalance;
            p.add(m);
        }
    }
}



public class Q2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // number of transactions
		Flipkart account=new Flipkart();
		
		LinkedList<Money> p=new LinkedList<>();
		
		for(int i=0;i<n;i++)
		{
		    String bankName=sc.next();
		    int customerAmount=sc.nextInt();
		    int productPrice=sc.nextInt();
		    account.transaction(bankName, customerAmount, productPrice,p);
		}
		
		for(Money m:p)
		{
		    System.out.println(m.flipkartBalance+" "+m.remainingBalance);
		}
		
	}
	
}

