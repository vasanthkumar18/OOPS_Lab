import java.io.*;
import java.lang.*;
import java.util.*;


class Membership
{
    int discount=0;
}

class Premium extends Membership
{
    int discount=20;
}

class Gold extends Membership
{
    int discount=15;
}

class Silver extends Membership
{
    int discount=10;
}

class Customer
{
    String name;
    String phone;
    String membership;
    
    Customer(String name, String phone, String membership)
    {
        this.name=name;
        this.phone=phone;
        this.membership=membership;
    }
        
}

class Service
{
    String serviceName;
    int cost;
    Service(String serviceName, int cost)
    {
        this.serviceName=serviceName;
        this.cost=cost;
    }
}

public class Q6
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    // Taking input details
	    System.out.println("Enter Customer Details");
	    System.out.print("Name: ");
	    String name=sc.next();
	    System.out.print("Phone: ");
	    String phone=sc.next();
	    System.out.print("Membership: ");
	    String membership=sc.next();
	    
	    Customer cust=new Customer(name,phone,membership);
	    ArrayList<Service> services=new ArrayList<>();
	    System.out.println();
	    while(true)
	    {
	        System.out.print("Add Service(Y/N): ");
	        String buffer=sc.nextLine(); // to store \n
	        char choice=sc.nextLine().charAt(0);
	        if(choice=='Y')
	        {
	            System.out.print("Add Service: ");
	            String serviceName=sc.next();
	            System.out.print("Rate: ");
	            int cost=sc.nextInt();
	            Service s=new Service(serviceName,cost);
	            services.add(s);
	        }
	        else 
	        break;
	    }
	    System.out.println();
	    System.out.println("*****BILL*****");
	    System.out.println(cust.name+"\t"+cust.phone+"\t"+cust.membership);
	    
	   
	    int discountPercentage=0;
	    if(cust.membership.equals("Premium"))
	    {
	        Premium p=new Premium();
	        discountPercentage=p.discount;
	    }
	    else if(cust.membership.equals("Gold"))
	    {
	        Gold g=new Gold();
	        discountPercentage=g.discount;
	    }
	    else 
	    {
	        Silver si=new Silver();
	        discountPercentage=si.discount;
	    }
	    
	    int serialNumber=0;
	    float totalCost=0;
	    float totalDiscount=0;
	    
	    for(Service s:services)
	    {
	        System.out.println(serialNumber+". "+s.serviceName+"\t"+s.cost);
	        serialNumber++;
	        totalCost+=s.cost;
	        float discountOfItem=(float)(s.cost*discountPercentage)/(float)100;
	        totalDiscount+=discountOfItem;
	    }
	    System.out.println("Total: "+totalCost+"- "+totalDiscount);
	    System.out.print("Please Pay: ");
	    float finalcost=totalCost-totalDiscount;
	    
	    if(finalcost%(int)finalcost==0)
	    {
	        System.out.println((int)(totalCost-totalDiscount));
	    }
	    else System.out.println((totalCost-totalDiscount));    
	    
	    
	    
	}
}

