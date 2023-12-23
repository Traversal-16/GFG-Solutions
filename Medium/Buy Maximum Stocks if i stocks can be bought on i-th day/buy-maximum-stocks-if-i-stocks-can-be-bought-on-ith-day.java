//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Pair
{
    int price;
    int index;
    Pair (int price,int index)
    {
        this.price=price;
        this.index=index;
    }
}
class NameComparator implements Comparator <Pair>
{
    public int compare (Pair a,Pair b)
    {
        return a.price-b.price;
    }
}
class Solution 
{
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        List<Pair> l=new ArrayList <>();
        for (int i=0;i<n;i++)
        {
            l.add (new Pair(price[i],i+1));
        }
        Collections.sort (l,new NameComparator ());
        int ans=0;
        for (int i=0;i<n;i++)
        {
            int cost=l.get(i).price;
            int count=l.get(i).index;
            if (count*cost<=k)
            {
                ans+=count;
                k-=count*cost;
            }
            else
            {
                int nc=((int)k/cost);
                ans+=nc;
                k-=nc*cost;
            }
        }
        return ans;
    }
}
        
