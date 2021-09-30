import java.io.*;
import java.lang.*;
import java.util.*;

public class Q7
{
   
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number");
		int n=sc.nextInt(); 
		long dp[]=new long[n+1]; // using dynamic programming
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		dp[3]=2;
		for(int i=4;i<=n;i++) dp[i]=dp[i-1]+dp[i-2];
		System.out.println("Result");
		for(int i=0;i<n;i++) System.out.print(dp[i]+" ");
		System.out.println();
		

		
		
	}
}
