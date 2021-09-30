import java.lang.*;
import java.util.*;
import java.io.*;

public class Q1
{
    static Node head; // The head of the Linkedlist
    public static class Node  
    {
        char data; // to store the data
        Node next; // points to the next node
        Node(char data)
        {
            this.data=data;
            next=null;
        }
    }
    
    public static class ReverseMain // Class to reverse the linkedlist
    {
        public static Node reverseList(Node root)
        {
            Node pre=null; // previous node
            Node cur=root; // current node
            Node next=null; // next node
            while(cur!=null)
            {
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            return pre;
        }
    }
    
    public static void addNode(char data) // Appending a node to the linkedlist
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        Node temporaryNode=head;
        while(temporaryNode.next!=null)
        {
            temporaryNode=temporaryNode.next;
        }
        temporaryNode.next=new Node(data);
    }
    
    // To display the linkedlist
    public static void display()
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
    
	public static void main(String[] args) 
	{
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the number of nodes");
	    int numberOfNodes=scanner.nextInt();
	    int countOfNode=1;
	    while(numberOfNodes!=0)
	    {
	        System.out.print("Enter the data in Node "+countOfNode+" : ");
	        countOfNode++;
	        char data=scanner.next().charAt(0);
	        addNode(data);
	        numberOfNodes--;
	    }
	    System.out.println("The list is");
	    display();
	    System.out.println("\nThe reversed list is");
	    ReverseMain reverse=new ReverseMain();
	    head=reverse.reverseList(head);
	    display();
	    
	}
}

