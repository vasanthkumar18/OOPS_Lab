import java.io.*;
import java.lang.*;
import java.util.*;


public class Q7
{
    public static class Student
    {
        String rollNumber;
        String fullName;
        String height;
        String weight;
        
        public void readStudent(String rollNumber, String fullName, String height, String weight)
        {
            this.rollNumber=rollNumber;
            this.fullName=fullName;
            this.height=height;
            this.weight=weight;
        }
        
       public String getHeight()
        {
            int n=height.length();
            String p=height.substring(0,n-2);
           // return Integer.parseInt(p);
            return height;
        }
       
        
    }
    
    public static class SortAccordingToHeight implements Comparator<Student>
    {
        public int compare(Student o1, Student o2)
        {
            return o1.getHeight().compareTo(o2.getHeight());
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents=sc.nextInt();
		System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
		ArrayList<Student> arr=new ArrayList<>();
		String buffer=sc.nextLine();
		for(int i=0;i<numberOfStudents;i++)
		{
		    String p=sc.nextLine();
		    String details[]=p.split(",");
		    Student individual=new Student();
		    individual.readStudent(details[0],details[1],details[2],details[3]);
		    arr.add(individual);
		}
		
		Collections.sort(arr, new SortAccordingToHeight());
		System.out.println("\nOUTPUT");
	    for(Student s:arr)
	    {
	        System.out.println(s.rollNumber+", "+s.fullName+", "+s.height+", "+s.weight);
	    }
        // now I have to code the sortAccordingToHeight class which has a method that Overrides compare method from Comparator interface
        // i.e implement Comparator interface 
        // in the class, I can Override compare method
	}
}
