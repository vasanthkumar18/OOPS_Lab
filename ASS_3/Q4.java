import java.lang.*;
import java.util.*;
import java.io.*;

public class Q4
{
    public static class Employee
    {
        int id;
        String name;
        String department;
        int salary;
    }
    
    public static class Manager extends Employee // (Manager) child class of Employee
    {
        int bonus;
        Manager(int id, String name, String department, int salary, int bonus)
        {
            super.id=id;
            super.name=name;
            super.department=department;
            super.salary=salary;
            this.bonus=bonus;
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of manager's details you need to add");
	    int numberOfManagers=Integer.parseInt(sc.nextLine());
	    HashMap<Manager,Integer> listOfManagers=new LinkedHashMap<>();
	    System.out.println("Enter each Manager's details");
	    while(numberOfManagers!=0)
	    {
	        String details=sc.nextLine();
	        String managerDetails[]=details.split(" ");
	        int id=Integer.parseInt(managerDetails[0]);
	        
	        
	        String name=managerDetails[1];
	        String department=managerDetails[2];
	        int salary=Integer.parseInt(managerDetails[3]);
	        int bonus=Integer.parseInt(managerDetails[4]);
	        
	        
	        Manager person=new Manager(id,name,department,salary,bonus);
	        listOfManagers.put(person,salary+bonus);
	        numberOfManagers--;
	    }
	    System.out.println("Output");
	    int maxPay=Integer.MIN_VALUE;
	    for(Manager person:listOfManagers.keySet())
	    {
	        maxPay=Math.max(maxPay,listOfManagers.get(person));
	    }
	    for(Manager person:listOfManagers.keySet())
	    {
	        if(maxPay==listOfManagers.get(person))
	        {
	            System.out.println(person.id+" "+person.name+" "+person.department+" "+person.salary+" "+person.bonus);
	        }
	    }
	    
	}
}

