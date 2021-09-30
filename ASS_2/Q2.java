import java.io.*;
import java.lang.*;
import java.util.*;

public class Q2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String arr[]=input.split(" ");
		System.out.println("Words count is: "+arr.length);
		for(int i=0;i<input.length();i++)
		{
		    char p=input.charAt(i);
		    int ascii=p;
		    System.out.println("Character "+p+": "+ascii);
		}
		
	}
}
