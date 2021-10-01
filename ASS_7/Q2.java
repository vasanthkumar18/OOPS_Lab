import java.io.*;
import java.lang.*;
import java.util.*;



public class Q2
{
    public static void printLine(String filename)
    {
        try
		{
		    File f1=new File(filename);
    		Scanner data=new Scanner(f1);
    		while(data.hasNextLine())
    		{
    		    String line=data.nextLine();
    		    int size=line.length();
    		    int flag=0;
    		    for(int i=0;i<size;i++)
    		    {
    		        if(line.charAt(i)>='0' && line.charAt(i)<='9') 
    		        {
    		            continue;
    		        }
    		        else 
    		        {
    		            flag=1;
    		            System.out.println("OtherCharactersFound");
    		            break;
    		        }
    		    }
    		    if(flag==0)
    		    {
    		        System.out.println(line);
    		    }
    		    
    		}
    		
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		printLine(filename);
		
	}
	
}

