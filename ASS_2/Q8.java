import java.io.*;
import java.lang.*;
import java.util.*;


public class Q8
{
    enum Bustype
    {
        O,F,L;
    }
    public static class Train
    {
        int busno;
        String from;
        String to;
        int distance;
        Bustype type;
        
        
        public void insertDefault(int busno, String from, String to, int distance)
        {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            type=Bustype.valueOf("O");
        }
        
        public void insert(int busno, String from, String to, int distance, String type)
        {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            this.type=Bustype.valueOf(type);
        }
        
        public int calcFare()
        {
            switch(type)
            {
                case O:
                    return 10*distance;
                case F:
                    return 20*distance;
                case L:
                    return 24*distance;
            }
            return 0;
        }
        
        
        public void display()
        {
            int fare=calcFare();
            System.out.println(busno+" "+from+" "+to+" "+distance+" "+type+" "+fare);
        }
        
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Train> list=new ArrayList<Train>();
		while(true)
		{
    	    System.out.println("1-Add details");
            System.out.println("2-Show details");
            System.out.println("3-Exit");
            System.out.print("\nEnter Choice: ");
            int n=sc.nextInt();
            String buffer=sc.nextLine();
            if(n==1)
            {
                System.out.println("Enter bus details(Busno,from,to,distance,type)");
                String details=sc.nextLine();
                String arr[]=details.split(" ");
                Train p=new Train();
                if(arr.length==4)
                {
                    p.insertDefault(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]));
                    
                }
                else
                {
                    p.insert(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]);
                }
                list.add(p);
                
            }
            else if(n==2)
            {
                for(Train p:list)
                {
                    p.display();
                }
            }
            else
            {
                break;
            }
            
		}
	}
}
