import java.io.*;
import java.lang.*;
import java.util.*;


class Work
{
    public void display(char a, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    
    public void display(int n)
    {
        System.out.println(n*(n+1)/2);
    }
    
    public void display(int a, int b)
    {
        System.out.println((a*a)+(b*b));
    }
}
public class Q1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String inp=sc.nextLine();
	    String input[]=inp.split(" ");
	    Work solution=new Work();

	    if(input.length==2)
	    {
	        // inorder to check if the first input is character or integer, we have to do this
	        
	        int check=0;
	        try 
	        {
	            int p=Integer.parseInt(input[0]); // if this works, it won't go to catch, if it fails it'll go to catch
	        } 
	        catch(Exception e) 
	        {
	            check=1;
	        }
	        if(check==0)
	        {
	            solution.display(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
	        }
	        else solution.display(input[0].charAt(0),Integer.parseInt(input[1]));
	    }
	    else
	    {
	        solution.display(Integer.parseInt(input[0]));
	    }
	    
	}
}

