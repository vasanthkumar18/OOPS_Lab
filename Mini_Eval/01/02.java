import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
    public static boolean isStringLowerCase(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ') continue;
            if(!Character.isLowerCase(str.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        
        int a=str1.length();
        int b=str2.length();
        int c=str3.length();
        
        if(!isStringLowerCase(str1))
        {
            System.out.println("ERROR");
            return;
        }
        if(!isStringLowerCase(str2))
        {
            System.out.println("ERROR");
            return;
        }
        if(!isStringLowerCase(str3))
        {
            System.out.println("ERROR");
            return;
        }
        
        // finding sum of all string's length : TASK 1
        System.out.println(a+b+c);
        
        // printing all strings whose length is max : TASK 2
        int max=Math.max(a,Math.max(b,c));
        if(a==b && b==c)
        {
            System.out.println("str1=str2=str3");
        }
        else if(a==b && c<a)
        {
            System.out.println("str1=str2");
        }
        else if(b==c && a<b)
        {
            System.out.println("str2=str3");
        }
        else if(a==c && b<a)
        {
            System.out.println("str1=str3");
        }
        else if(max==a)
        {
            System.out.println(str1);
        }
        else if(max==b)
        {
            System.out.println(str2);
        }
        else if(max==c)
        {
            System.out.println(str3);
        }
        
        // TASK 3
        String firstLetter=str2.substring(0,1);
        firstLetter=firstLetter.toUpperCase();
        String string2=firstLetter+str2.substring(1);
        String string3=str3.toUpperCase();
        // display output
        System.out.println(str1+" "+string2+" "+string3);
    }
}
