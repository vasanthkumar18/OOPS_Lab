import java.lang.*;
import java.util.*;
import java.io.*;

public class Q5
{
    public static class Person
    {
        String name;
    }
    
    public static class Patient extends Person // Patient: child class of Person 
    {
        String patient_ID;
        Patient(String name, String patient_ID)
        {
            super.name=name;
            this.patient_ID=patient_ID;
        }
    }
    
    // method to sort the patients list by age which is in patient id
    public static HashMap<Patient,Integer> sortByValue(HashMap<Patient,Integer> listOfPatients)
    {
        List<Map.Entry<Patient, Integer> > list =
               new LinkedList<Map.Entry<Patient, Integer>>(listOfPatients.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Patient, Integer>>() 
        {
            public int compare(Map.Entry<Patient, Integer> o1,
                               Map.Entry<Patient, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        }
        );
         
        // put data from sorted list to hashmap
        HashMap<Patient, Integer> temp = new LinkedHashMap<Patient, Integer>();
        for (Map.Entry<Patient, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of patients");
	    int numberOfPatients=sc.nextInt();
	    String buffer=sc.nextLine();
	    HashMap<Patient,Integer> listOfPatients=new HashMap<>();
	    int countOfPatients=1;
	    while(numberOfPatients!=0)
	    {
	        System.out.println("\nEnter the details of patient "+countOfPatients+": ");
	        countOfPatients++;
	        System.out.print("Name: ");
	        String name=sc.nextLine();
	        System.out.print("Patient ID: ");
	        String patient_ID=sc.nextLine();
	        int age=Integer.parseInt(patient_ID.split("-")[1]);
		Patient human=new Patient(name,patient_ID);
		listOfPatients.put(human,age);
		numberOfPatients--;
	    }
	    listOfPatients=sortByValue(listOfPatients);
	    System.out.println("\nList of Patients to be tested are:");
	    for(Patient patient: listOfPatients.keySet())
	    {
	        System.out.println(patient.patient_ID+" "+patient.name);
	    }
	    
	    
	}
}

