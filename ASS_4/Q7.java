import java.io.*;
import java.lang.*;
import java.util.*;

class Person
{
    String personName;
    int age;
}

class Student extends Person
{
    int rollNumber;
    int percentageOfMarks;
    
}

class PGStudent extends Student
{
    String elective;
    int numberOfSubjects;
}

public class Q7
{
    public static HashMap<PGStudent,Integer> sortByValue(HashMap<PGStudent,Integer> map)
    {
        List<Map.Entry<PGStudent, Integer> > list =
               new LinkedList<Map.Entry<PGStudent, Integer>>(map.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<PGStudent, Integer>>() 
        {
            public int compare(Map.Entry<PGStudent, Integer> o1,
                               Map.Entry<PGStudent, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        }
        );
         
        // put data from sorted list to hashmap
        HashMap<PGStudent, Integer> temp = new LinkedHashMap<PGStudent, Integer>();
        for (Map.Entry<PGStudent, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    int k=sc.nextInt();
	    String buffer=sc.nextLine();
	    HashMap<PGStudent,Integer> map=new HashMap<PGStudent,Integer>();
	    while(k!=0)
	    {
	        String inp=sc.nextLine();
	        String ip[]=inp.split(":");
	        PGStudent p=new PGStudent();
	        p.personName=ip[0];
	        p.age=Integer.parseInt(ip[1]);
	        p.elective=ip[2];
	        p.percentageOfMarks=Integer.parseInt(ip[3]);
	        map.put(p,p.percentageOfMarks);
	        k--;
	    }
	    map=sortByValue(map);
	    for(PGStudent mem:map.keySet())
	    {
	        System.out.println(mem.personName);
	    }
	    
	}
	
}

