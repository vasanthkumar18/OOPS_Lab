import java.lang.*;
import java.util.*;
import java.io.*;

public class Q2
{
    public static class InvoiceItem // class for Item in the inventory
    {
        int id;
        String name;
        int cost;
        InvoiceItem(int id, String name, int cost)
        {
            this.id=id;
            this.name=name;
            this.cost=cost;
        }
    }
    
    // to find the cost of an item in the inventory
    public static int findCost(ArrayList<InvoiceItem> itemList, int id, int quantity)
    {
        int check=0;
        int cost=0;
        for(InvoiceItem item:itemList)
        {
            if(item.id==id)
            {
                System.out.println(item.id+", "+item.name+", "+item.cost+", "+quantity);
                cost=item.cost;
                check=1;
                break;
            }
        }
        if(check==0)
        {
            System.out.println("No such item in inventory");
        }
        return cost;
    }
	public static void main(String[] args) 
	{
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list");
	    ArrayList<InvoiceItem> itemList=new ArrayList<>();
	    while(true)
	    {
	        String details=scanner.nextLine();
	        if(details.equals("OKAY")) break;
	        String detailsDivision[]=details.split(" ");
	        int id=Integer.parseInt(detailsDivision[0]);
	        String name=detailsDivision[1];
	        int cost=Integer.parseInt(detailsDivision[2]);
	        InvoiceItem item=new InvoiceItem(id,name,cost);
	        itemList.add(item);
	    }
	    System.out.println();
	    while(true)
	    {
	        System.out.println("\n1.Add Invoice\n2.Exit\nChoice: ");
	        int choice=scanner.nextInt();
	        if(choice==1)
	        {
	            System.out.println("Add Invoice Item(Y/N)");
	            String buffer=scanner.nextLine();
	            char check=scanner.nextLine().charAt(0);
	            if(check=='Y')
	            {
	                // Take the invoice items 
	                System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
	                HashMap<Integer,Integer> shoppingCart=new HashMap<>();
	                while(true)
            	    {
            	        String details=scanner.nextLine();
            	        if(details.equals("OKAY")) break;
            	        String detailsDivision[]=details.split(" ");
            	        int id=Integer.parseInt(detailsDivision[0]);
            	        int cost=Integer.parseInt(detailsDivision[1]);
            	        shoppingCart.put(id,cost);
            	    }
            	    
            	    // create INVOICE and calculate TOTAL price 
            	    System.out.println("****INVOICE****");
            	    int totalPrice=0;
            	    for(Integer id:shoppingCart.keySet())
            	    {
            	        int quantity=shoppingCart.get(id);
            	        int price=findCost(itemList, id, quantity);
            	        totalPrice+=price*quantity;
            	    }
            	    System.out.println("TOTAL: "+totalPrice);
            	    System.out.println("********");
            	    
	            }
	            else continue;
	        }
	        else break;
	        
	    }
	}
}

