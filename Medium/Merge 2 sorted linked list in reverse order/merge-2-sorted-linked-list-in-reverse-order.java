//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	
	Node ans=null;
	if(node1==null && node2==null) return null;
	if (node1==null)
	{
	    ans=new Node(node2.data);
	    node2=node2.next;
	}
	else if (node2==null)
	{
	    ans=new Node(node1.data);
	    node1=node1.next;
	}
	else if (node1.data<=node2.data)
	{
	    ans=new Node (node1.data);
	    node1=node1.next;
	}
	else
	{
	    ans=new Node (node2.data);
	    node2=node2.next;
	}
	Node i=node1;
	Node j=node2;
	Node temp=ans;
	while (i!=null && j!=null)
	{
	    if (i.data<=j.data)
	    {
	        temp.next=new Node (i.data);
	        temp=temp.next;
	        i=i.next;
	    }
	    else
	    {
	        temp.next=new Node(j.data);
	        temp=temp.next;
	        j=j.next;
	    }
	}
	
	while (i!=null)
	{
	    temp.next=new Node (i.data);
	    temp=temp.next;
	    i=i.next;
	}
	while (j!=null)
	{
	    temp.next=new Node (j.data);
	    temp=temp.next;
	    j=j.next;
	}
	List<Integer> l=new ArrayList <>();
	while (ans!=null)
	{
	    l.add(ans.data);
	    ans=ans.next;
	}
	
	Node s=new Node(l.get(l.size()-1));
	Node p=s;
	for (int i1=l.size()-2;i1>=0;i1--)
	{
	    p.next=new Node(l.get(i1));
	    p=p.next;
	}
	return s;
    }
}
