import java.io.*;
import java.lang.*;
import java.util.*;


public class oopslabrank
{
    public static HashMap<String, Double> sortByValue(HashMap<String, Double> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double> > list =
               new LinkedList<Map.Entry<String, Double> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Double> >() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
	public static void main(String[] args) 
	{

		  File f1 = new File("/home/vasanth/Desktop/SEM 7/Ranking/OOS/oos.txt");
		  HashMap<String,Double> map1=new HashMap<>(); // roll and Marks
		  HashMap<String,String> map2=new HashMap<>(); // roll and Name
		  try {
			      Scanner sc=new Scanner(f1);
			      System.out.println("here");
			      while(sc.hasNextLine())
			      {
				  
				  String p=sc.nextLine();
				  System.out.println(p);
				  String inp[]=p.split(" ");
				  int len=inp.length;
				  String roll=inp[1];
				  double marks=Double.parseDouble(inp[len-1]);
				  String name="";
				  for(int i=2;i<=len-12;i++)
				  {
				  	name+=inp[i]+" ";
				  }

				  map1.put(roll,marks);
				  map2.put(roll,name);
		          
		      		}
		      
		  } 
		  catch(Exception e) {}
		  System.out.println(map1);
		  System.out.println("==================================================");
		  System.out.println(map2);
		  System.out.println("==================================================");
		  
		  HashMap<String, Double> hm1 = sortByValue(map1);
 
		// print the sorted hashmap
		int i=1;
		for (Map.Entry<String, Double> en : hm1.entrySet()) 
		{
		    String roll=en.getKey();
		    double marks=en.getValue();
		    String name=map2.get(roll);
		    System.out.println(i+" "+roll+" "+name+" "+marks);
            		i++;
		}
		  

	}
}

