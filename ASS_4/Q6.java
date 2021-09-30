import java.io.*;
import java.lang.*;
import java.util.*;


class Employee
{
    int employeeId;
    String employeeName;
    float salary;
    Employee(int employeeId, String employeeName)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    void calculateSalary()
    {
        
    }
}
class PermanentEmployee extends Employee 
{
    int basicPay;
    float PFAmount;
    PermanentEmployee(int employeeId, String employeeName,int basicPay)
    {
        super(employeeId,employeeName);
        this.basicPay=basicPay;
    }
    void calculateSalary()
    {
        PFAmount=(float)basicPay*12/(float)100;
        salary=basicPay-(PFAmount);
        System.out.println(employeeId+" "+employeeName+" "+(int)salary);
    }
    
}
class TemporaryEmployee extends Employee
{
    int hoursWorked;
    int hourlyWages;
    TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages)
    {
        super(employeeId,employeeName);
        this.hourlyWages=hourlyWages;
        this.hoursWorked=hoursWorked;
    }
    void calculateSalary()
    {
        salary=hourlyWages*hoursWorked;
        System.out.println(employeeId+" "+employeeName+" "+(int)salary);
    }
}
public class Q6
{
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    int k=sc.nextInt();
	    String buffer=sc.nextLine();
	    ArrayList<Employee> arr=new ArrayList<>();
	    while(k!=0)
	    {
	        String inp=sc.nextLine();
	        String ip[]=inp.split(" ");
	        int employeeType=Integer.parseInt(ip[0]);
	        int employeeId=Integer.parseInt(ip[1]);
	        String employeeName=ip[2];
	        if(employeeType==1)
	        {
	            int basicPay=Integer.parseInt(ip[3]);
	            Employee emp=new PermanentEmployee(employeeId,employeeName,basicPay);
	            arr.add(emp);
	        }
	        else{
	            int hoursWorked=Integer.parseInt(ip[3]);
	            int hourlyWages=Integer.parseInt(ip[4]);
	            Employee emp=new TemporaryEmployee(employeeId,employeeName,hoursWorked,hourlyWages);
	            arr.add(emp);
	        }
	        k--;
	        
	    }
	    int check=sc.nextInt();
	    int found=0;
	    for(Employee emp:arr)
	    {
	        if(emp.employeeId==check)
	        {
	            emp.calculateSalary();
	            found=1;
	            break;
	        }
	    }
	    if(found==0)
	    {
	        System.out.println("-1");
	    }
	    
	}
	
}

