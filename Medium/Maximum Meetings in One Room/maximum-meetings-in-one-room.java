//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends

class Pair 
{
    int start;
    int end;
    int ind;
    Pair (int a,int b,int c)
    {
        start=a;
        end=b;
        ind=c;
    }
}
class NameComparator implements Comparator<Pair>
{
    public int compare (Pair a,Pair b)
    {
        if (a.end!=b.end)
        {
            return a.end-b.end;
        }
        else
        {
            return a.ind-b.ind;
        }
    }
}
class Solution 
{
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) 
    {
        // code here
        List<Pair> l=new ArrayList <>();
        for (int i=0;i<N;i++)
        {
            l.add(new Pair (S[i],F[i],i));
        }
        Collections.sort (l,new NameComparator ());
        ArrayList<Integer> ans=new ArrayList <>();
        int end=-1;
        for (int i=0;i<N;i++)
        {
            if (l.get(i).start>end)
            {
                ans.add ((l.get(i).ind)+1);
                end=l.get(i).end;
            }
        }
        Collections.sort (ans);
        return ans;
    }
}
        
