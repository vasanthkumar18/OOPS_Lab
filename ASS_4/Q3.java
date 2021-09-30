import java.io.*;
import java.lang.*;
import java.util.*;


public class Q3
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); // input scanner 
	    int k=sc.nextInt();
	    String buffer=sc.nextLine();
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	    while(k!=0)
	    {
	        String inp=sc.nextLine();
	        inp=inp.substring(1,inp.length()-1);
	        String ip[]=inp.split(",");
	        int height=Integer.parseInt(ip[2]);
	        if(!map.containsKey(height))
	        {
	            map.put(height,ip[0]);
	        }
	        else
	        {
	            String one=ip[0];
	            String two=map.get(height);
	            if(one.compareTo(two)<0)
	            {
	                map.put(height,ip[0]);
	            }
	        }
	        k--;
	    }
	    System.out.println(map.size());
	    String ans="";
	    for(Integer height:map.keySet())
	    {
	        ans+=map.get(height)+",";
	    }
	    ans=ans.substring(0,ans.length()-1);
	    System.out.println(ans);
	}
	
}

