import java.io.*;
import java.lang.*;
import java.util.*;

class Car
{
    String modelName;
    String engineNo;
    int basePrice;
    int additionalCharge;
    
    public int totalPrice()
    {
        return basePrice+additionalCharge;
    }
}

class Dealer
{
    String dealerName;
    float discountPercentage;
    Car c=new Car();
    int price;
    Dealer(String modelName, String engineNo, int basePrice, int additionalCharge, String dealerName, float discountPercentage)
    {
        this.dealerName=dealerName;
        this.discountPercentage=discountPercentage;
        c.modelName=modelName;
        c.engineNo=engineNo;
        c.basePrice=basePrice;
        c.additionalCharge=additionalCharge;
        price=c.totalPrice();
    }
    
    public void onRoadPrice()
    {

        int total=(int)(price-(float)(price*discountPercentage)/(float)100);
        System.out.println(c.modelName+" "+price+" "+total);
    }
}

public class Q5
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    int k=sc.nextInt();
	    String buffer=sc.nextLine();
	    ArrayList<Dealer> arr=new ArrayList<>();
	    while(k!=0)
	    {
	        String inp=sc.nextLine();
	        String ip[]=inp.split(" ");
	        Dealer d=new Dealer(ip[0],ip[1],Integer.parseInt(ip[2]),Integer.parseInt(ip[3]),ip[4],Float.parseFloat(ip[5]));
	        arr.add(d);
	        k--;
	    }
	    for(Dealer mem:arr)
	    {
	        mem.onRoadPrice();
	    }
	    
	}
	
}

