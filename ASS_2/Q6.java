import java.io.*;
import java.lang.*;
import java.util.*;

public class Q6
{

    public static class Student
    {
        private String name;
        private String roll;
        private float cgpa;
        
        public void setName(String name) 
        {
            this.name=name;
        }
        
        public void setRoll(String roll)
        {
            this.roll=roll;
        }
        
        public void setCgpa(float cgpa)
        {
            this.cgpa=cgpa;
        }
        
        public String getName()
        {
            return name;
        }
        
        public String getRoll()
        {
            return roll;
        }
        
        public float member()
        {
            return cgpa*(float)9.5;
        }
    }
    

    public static void main (String[]args)
      {
        Scanner sc = new Scanner (System.in);
          System.out.print("Enter number of students: ");
          int n=sc.nextInt();
          System.out.println("Enter student details: ");
          ArrayList<String> arr=new ArrayList<>();
          int students=n;
          String buffer=sc.nextLine(); // to take nextline ( buffer )
          while(n!=0)
          {
              String p=sc.nextLine();
              arr.add(p);
              n--;
              
          }
          
          
          int i=0;
          System.out.println("\nOUTPUT: ");
          while(i!=students)
          {
              String[] details=arr.get(i).split(" ");
              Student s=new Student();
              s.setName(details[0]);
              s.setRoll(details[1]);
              s.setCgpa(Float.parseFloat(details[2]));
              float percentage=s.member();
              System.out.println(s.getName()+" "+s.getRoll()+" "+percentage+"%");
              i++;
              
          }
          
          
    
      }
}
