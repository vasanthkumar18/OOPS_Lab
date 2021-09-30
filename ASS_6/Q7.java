import java.util.*;
import java.lang.*;
import java.io.*;
interface TaxCalculatable
{
   int calculateTax();
}
class Vehicle implements TaxCalculatable
{
    String modelNumber;
    int rateBought;
    String fuelType ;
    int numberOfWheels;
    Vehicle(String modelNumber,int rateBought,String fuelType,int numberOfWheels)
    {
        this.modelNumber=modelNumber;
        this.rateBought=rateBought;
        this.fuelType=fuelType;
        this.numberOfWheels=numberOfWheels;
    }
    
    public int calculateTax()
    {
      return 0;
    }
    
}
class Car extends Vehicle
{
    int numberOfPassengers;
    int tax;
    Car(String modelNumber,int rateBought,String fuelType,int numberOfWheels,int numberOfPassengers)
    {
        super(modelNumber,rateBought,fuelType,numberOfWheels);
        this.numberOfPassengers=numberOfPassengers;
    }
    public int calculateTax(String fuelType)
    {
        if(fuelType.equals("petrol"))
        {
            tax=(int)((rateBought*0.1 * numberOfPassengers)*0.5);
        }
        else
        {
             tax=(int)((rateBought*0.1 * numberOfPassengers)*0.4);
        }
        return tax;
    }
 
  
    
    
}
class Truck extends Vehicle
{
    int loadLimit;
    int tax;
    Truck(String modelNumber,int rateBought,String fuelType,int numberOfWheels,int loadlimit)
    {
        super(modelNumber,rateBought,fuelType,numberOfWheels);
        this.loadLimit=loadlimit;
    }
    public int calculateTax(String fuelType)
    {
        if(fuelType.equals("petrol"))
        {
            tax=(int)((rateBought*0.1 * loadLimit*0.002)*0.5);
        }
        else
        {
             tax=(int)((rateBought*0.1 * loadLimit*0.002)*0.4);
        }
        return tax;
    }
 
  
    
}
public class Main
{
    public static int getKeyByValue(TreeMap<Integer, Vehicle> map, Vehicle value) 
    {
        for (Map.Entry<Integer, Vehicle> entry : map.entrySet()) 
        {
            if (Objects.equals(value, entry.getValue())) 
            {
                return entry.getKey();
            }
        }
        return 0;
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Car> list1=new ArrayList<Car>();
	    ArrayList<Truck> list2=new ArrayList<Truck>();
	    TreeMap<Integer,Vehicle> tm=new TreeMap<>();
	    for(;;)
	    {
        	    System.out.println("1. Add Vehicle\n2. Display Vehicles\n3. Exit\nEnter your choice:\n");
                int n=sc.nextInt();
                String esc=sc.nextLine();
                if(n==1)
                {
                         System.out.println("a.Car\nb.Truck\n");
                         System.out.println("Enter your choice:");
                         char ch=sc.nextLine().charAt(0);
                         System.out.println("ModelNumber:");
                         String model=sc.nextLine();
                         System.out.println("Rate:");
                         int rate=sc.nextInt();
                         System.out.println("FuelType(petrol/diesel):");
                         String buffer=sc.nextLine();
                         String fueltype=sc.nextLine();
                         if(ch=='a')
                         {
                             
                             System.out.println("Passengers:");
                             int passengers=sc.nextInt();
                             Car obj=new Car(model,rate,fueltype,4,passengers);
                             Vehicle a=new Vehicle(model,rate,fueltype,4);
                             int totaltax=obj.calculateTax(fueltype);
                             list1.add(obj);
                             tm.put(totaltax,a);
                         }
                         if(ch=='b')
                         {
                             System.out.println("loadlimit");
                             int loadlimit=sc.nextInt(); 
                             Truck obj1=new Truck(model,rate,fueltype,6,loadlimit);
                             int totaltax=obj1.calculateTax(fueltype);
                             Vehicle b=new Vehicle(model,rate,fueltype,6);
                             list2.add(obj1);
                             tm.put(totaltax,b);
                             
                         }
                }
                else if(n==2)
                {
                    LinkedList<String> soln=new LinkedList<>();
                    for(Vehicle p:tm.values())
                    {
                        int tax=getKeyByValue(tm,p);
                        String t=Integer.toString(tax);
                        soln.add(p.modelNumber+" "+p.fuelType+" "+t);
                        
                    }
                    Collections.reverse(soln);
                    int size=soln.size();
                    for(int z=0;z<size;z++)
                    {
                        System.out.println(soln.get(z));
                    }
                   
                }
                else
                {
                         return;
                }
                 
	    }
        
         
	 
	}
}
