import java.io.*;
import java.lang.*;
import java.util.*;


public class Major
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
    
    public static double findfinalmajor(double a, double b, double c)
    {
        ArrayList<Double> arr=new ArrayList<>();
        a=(double)a/2.0;
        c=(double)2*((double)c/3.0);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        Collections.sort(arr);
        return arr.get(1)+arr.get(2);
    }
	public static void main(String[] args) 
	{
	    String loc1="/home/pandu/Desktop/OO/major1.txt"; // for 40
	    String loc2="/home/pandu/Desktop/OO/major2.txt"; // for 20
	    String loc3="/home/pandu/Desktop/OO/major3.txt"; // for 30
	  
        HashMap<String,Double> map1=findmarks(loc1);
        HashMap<String,Double> map2=findmarks(loc2);
        HashMap<String,Double> map3=findmarks(loc3);
        HashMap<String,Double> majormap=new HashMap<>();
        for(String name:map1.keySet())
        {
            double marks=findfinalmajor(map1.get(name),map2.get(name),map3.get(name));
            double roundOff = Math.round(marks* 100.0) / 100.0;
            majormap.put(name,roundOff);
            
        }
		  

		  
		HashMap<String, Double> hm1 = sortByValue(majormap);
 
		// print the sorted hashmap
		System.out.println("The Major 1 Marks has been tested for 40");
		System.out.println("The Major 2 Marks has been tested for 20");
		System.out.println("The Major 3 Marks has been tested for 30");
		System.out.println("=========================================");
		System.out.println("Each Major eval has been normalised to 20 marks and the best of two has been taken\n");
		int i=1;
		for (Map.Entry<String, Double> en : hm1.entrySet()) 
		{
		    String name=en.getKey();
		    System.out.println(i+" "+en.getKey() +" "+map1.get(name)+" "+map2.get(name)+" "+map3.get(name)+" "+en.getValue());
            		i++;
		}
		  

	}
}

