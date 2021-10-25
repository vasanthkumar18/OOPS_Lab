import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scanning inputs using Scanner
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int r=sc.nextInt();
        
        // Using Dynamic Programming to store elements in an array to avoid re calculation of fibonacci numbers
        
       
        
        int dp[]=new int[n+1];
        
        dp[0]=0;        // base cases
        dp[1]=1;
        // dp array
        for(int i=2;i<n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        long sum=0; // to store the result 
        if(s>n)
        {
            System.out.println(0);
            
        }
        for(int i=s-1;i<=r-1;i++)
            
        {
            sum+=dp[i];   
        }
        
        // display output
        System.out.println(sum);
    }
    
}
