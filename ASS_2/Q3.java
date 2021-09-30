import java.io.*;
import java.lang.*;
import java.util.*;

public class Q3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		String input=sc.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<input.length();i++)
		set.add(input.charAt(i));
		String ans="";
		for(Character p:set)
		ans+=p;
		System.out.println("Output:\n"+ans);
	}
}
