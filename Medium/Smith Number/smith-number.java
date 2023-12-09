//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static int sod (int n)
    {
        int s=0;
        while (n>0)
        {
            s+=(n%10);
            n /=10;
        }
        return s;
    }
    static int smithNum(int n) 
    {
        // code here
        if (n==2) return 0;
        int s1=0;
        int t=n;
        while (n%2==0)
        {
            s1+=2;
            n /=2;
        }
        
        for (int i=3;i<=t/2;i+=2)
        {
            while (n%i==0)
            {
                s1+=sod(i);
                n /=i;
            }
        }
        if (n>2 || sod(t)!=s1)
        return 0;
        return 1;
       
    }
};