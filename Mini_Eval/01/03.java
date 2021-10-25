import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
    
    public static class Marathon
    {
        String name;
        int chestid;
        String depName;
        int time;
        int index;
        Marathon(String name, int chestid, String depName, int time, int index)
        {
            this.name=name;
            this.chestid=chestid;
            this.depName=depName;
            this.time=time;
            this.index=index;
        }  
    }
    
    public static void finisherIndex(ArrayList<Marathon> participants)
    {
        sortMarathon(participants);
        int k=0;
        for(Marathon x: participants)
        {
            System.out.println(x.index+" "+x.name+" "+x.time);
            k++;
            if(k==3) break;
        }
    }
    
    public static void sortMarathon(ArrayList<Marathon> participants)
    {
        Collections.sort(participants,new Comparator<Marathon>()
                         {
                             public int compare(Marathon o1, Marathon o2)
                             {
                                if(o1.time<o2.time) return -1;
                                 else if(o1.time>o2.time) return 1;
                                 else return 0;
                             }
                         });
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //Taking inputs
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=20)
        {
            System.out.println("MAX 20");
            return;
        }
        else if(n<5)
        {
            System.out.println("MIN 5");
            return;
        }
        ArrayList<Marathon> arr=new ArrayList<>();
        int index=1;
        while(n!=0)
        {
            String name=sc.next();
            int chestid=sc.nextInt();
            String depName=sc.next();
            int time=sc.nextInt();
            Marathon participant=new Marathon(name,chestid,depName,time,index);
            index++;
            arr.add(participant);
            n--;
        }
        String checkName=sc.next();
        
        // TASK 1
        finisherIndex(arr);
        System.out.println();
        
        // TASK 2
        sortMarathon(arr);
        int k=0;
        for(Marathon x:arr)
        {
            System.out.println(x.name+" "+x.chestid+" "+x.depName+" "+x.time);
            k++;
            if(k==5) break;
        }
        
        //TASK 3
        System.out.println();
        int found=0;
        for(Marathon x:arr)
        {
            if(x.name.equals(checkName))
            {
                System.out.println(checkName+" YES");
                found=1;
                break;
            }
        }
        if(found==0)
        {
            System.out.println(checkName+" NO");
        }
        
        
    }
}
