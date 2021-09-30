package pack2;
import pack1.*;
import java.lang.*;
import java.util.*;
import java.io.*;
class StudentDataExtended extends StudentData
{
	private String location;
	public void addDetails(String id, String name, String location)
	{
		addStudentData(id,name);
		this.location=location;
	}
	public static void printDetails(TreeMap<String, StudentDataExtended> map)
	{
		for(String a:map.keySet())
		{
			StudentDataExtended student=map.get(a);
			System.out.println(student.getId()+" "+student.getName()+" "+student.location);
		}
	}
	public static void main(String[] args)
	{
		System.out.print("Enter the number of students : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String buffer=sc.nextLine();
		int count=1;
		TreeMap<String,StudentDataExtended> map=new TreeMap<>();
		while(n!=0)
		{
			System.out.println("Enter the details of Student "+count+" (id, name, location):");
			count++;
			String details=sc.nextLine();
			String studentInfo[]=details.split(" ");
			StudentDataExtended student=new StudentDataExtended();
			student.addDetails(studentInfo[0], studentInfo[1], studentInfo[2]);
			map.put(studentInfo[0],student);
			n--;
		}
		System.out.println("\nThe Student Details are:");
		printDetails(map);
		
	}
}
