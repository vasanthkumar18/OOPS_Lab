import java.io.*;
import java.lang.*;
import java.util.*;


public class Full
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
    
    public static HashMap<String,Double> findmarks(String location)
    {
        
        //File f1 = new File("/home/pandu/Desktop/marks.txt");
        HashMap<String,Double> map=new HashMap<>();
        File f1 = new File(location);
		  try 
		  {
			      Scanner sc=new Scanner(f1);
			      while(sc.hasNextLine())
			      {
				  
				  String p=sc.nextLine();
				  //System.out.println(p);
				  String inp[]=p.split(" ");
				  int len=inp.length;
				  String roll=inp[1];
				  double marks=0;
				  try
				  {
				      marks=Double.parseDouble(inp[len-1]);
				  }
				  catch(Exception e){}
				  map.put(roll,marks);
		          
		      	  }
		  } 
		  catch(Exception e) 
		  {
		      
		  }
		  
		  return map;
    }
    

	public static void main(String[] args) 
	{
	    String loc1="/home/pandu/Desktop/OO/Full/minor.txt"; // for 25
	    String loc2="/home/pandu/Desktop/OO/Full/major.txt"; // for 40
	    
	  
        HashMap<String,Double> map1=findmarks(loc1);
        HashMap<String,Double> map2=findmarks(loc2);
        HashMap<String,Double> majormap=new HashMap<>();
        for(String name:map1.keySet())
        {
            double marks=map1.get(name)+map2.get(name);
            double roundOff = Math.round(marks* 100.0) / 100.0;
            majormap.put(name,roundOff);
            
        }
		  

		  
		HashMap<String, Double> hm1 = sortByValue(majormap);
 
		// print the sorted hashmap
		System.out.println("The Major Marks has been tested for 40");
		System.out.println("The Minor Marks has been tested for 25");
		System.out.println("=========================================");
		System.out.println("Total for 65\n");
		int i=1;
		for (Map.Entry<String, Double> en : hm1.entrySet()) 
		{
		    String name=en.getKey();
		    System.out.println(i+" "+en.getKey() +" "+map1.get(name)+" "+map2.get(name)+" "+en.getValue());
            		i++;
		}
		  

	}
}

