import java.io.*;
import java.lang.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Queue
{
    Node front;
    Node rear;
 
    public Queue()
    {
        this.front = this.rear = null;
    }

   
    public boolean isEmpty()
    {
        if(this.rear==null) return true;
        return false;
    }
    
    public boolean isFull()
    {
        return false; // since linkedlist queue is never full
    }
    
    
    public void enqueue(int item)
    {
        Node temp = new Node(item);
        if (this.rear == null) 
        {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public int dequeue()
    {
        if (this.front == null)
        {
            System.out.println("EmptyQueue");
            return -1; 
        }
        int x=this.front.data;
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return x;
    }
    
    
    
}

public class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    Queue q= new Queue();
            while(true)
            {
                String inp;
                try {
                    inp=sc.nextLine();
                    if(inp.equals("\n")) return;
                } catch(Exception e) {
                    return;
                } 
                String in[];
                char ch;
                try{ 
                in=inp.split(" ");
                ch=in[0].charAt(0);
                }catch(Exception e)
                {
                    return;
                }
                if(ch=='E')
                {
                    int item=Integer.parseInt(in[1]);
                    System.out.println("Success");
                    q.enqueue(item);
                }
                else if(ch=='D')
                {
                    int item=q.dequeue();
                    if(item!=-1)
                    System.out.println(item);
                }
                else
                {
                    return;
                }
                
            }
	}
	
}

