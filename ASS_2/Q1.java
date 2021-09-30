import java.io.*;
import java.lang.*;
import java.util.*;

public class Q1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int total=0;
		for(Integer a:arr)
		{
		    if(hm.containsKey(a))
		    {
		        if(hm.get(a)==1)
		        {
		            hm.put(a,hm.get(a)+1);
		            total++;
		        }
		    }
		    else{
		        hm.put(a,1);
		        total++;
		    }
		}
		System.out.println("The length of the original array is: "+n);
		System.out.println("After removing duplicates, the new length of the array is: "+total);
		
	}
}
