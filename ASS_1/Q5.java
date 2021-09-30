import java.io.*;
import java.lang.*;
import java.util.*;

public class Q5
{
   
    public static void mergesort(int arr[], int l, int m, int r)
    {
        int size1=m-l+1;
        int size2=r-m;
        int left[]=new int[size1];
        int right[]=new int[size2];
        for(int i=0;i<size1;i++)
        {
            left[i]=arr[i+l];
        }
        for(int j=0;j<size2;j++)
        {
            right[j]=arr[j+m+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<size1 && j<size2)
        {
            if(left[i]>=right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
            }
        }
        while(i<size1)
        {
            arr[k++]=left[i++];
        }
        while(j<size2)
        {
            arr[k++]=right[j++];
        }
        
    }
    
    public static void sort(int arr[], int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            mergesort(arr,l,mid,r);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the size");
		int n=sc.nextInt(); 
		int arr[]=new int[n];
		System.out.println("Input the Elements");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		sort(arr,0,n-1); // using merge sort since Worst TC: o(logn)
		System.out.println("Sorted Array (Descending Order)");
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
	
		
		
	}
}
