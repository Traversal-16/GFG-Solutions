//{ Driver Code Starts
import java.util.*;

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


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        // if (head==null || head.next==null) return head;
        // List <Integer> l=new ArrayList <>();
        // Node cur=head;
        // while (cur!=null)
        // {
        //     l.add (cur.data);
        //     cur=cur.next;
        // }
        
        
        // int prefix[]=new int [l.size()];
        // prefix[l.size ()-1]=l.get (l.size()-1);
        // for (int i=l.size()-2;i>=0;i--)
        // {
        //     prefix[i]=Math.max (prefix[i+1],l.get (i));
        // }
        
        // for (int i=0;i<l.size();i++)
        // {
        //     System.out.println (l.get (i));
        // }
        
        // for (int i=0;i<l.size();i++)
        // {
        //     if (prefix[i]!=l.get (i))
        //     {
        //         l.remove (i);
        //     }
        // }
        
        
        // Node ans=new Node (l.get (0));
        // Node curr=ans;
        
        // for (int i=1;i<l.size ();i++)
        // {
        //     curr.next=new Node (l.get (i));
        //     curr=curr.next;
        // }
        // return ans;
        Node curr=head;
        while(curr.next!=null)
        {
            if(curr.data<curr.next.data)
            {
                curr.data=curr.next.data;
                curr.next=curr.next.next;
                curr=head;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head;
    }
}
  