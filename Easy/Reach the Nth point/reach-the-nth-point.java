//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod=(int) 1e9+7;
    public int solve (int n,int dp[])
    {
        if (n<0) return 0;
        if (n==0) return 1;
        if (dp[n]!=-1) return dp[n]%mod;
        
        return dp[n]=(solve (n-1,dp)%mod+solve (n-2,dp)%mod)%mod;
    }
    public int nthPoint(int n)
    {
        // Code here
        int dp[]=new int [n+1];
        Arrays.fill (dp,-1);
        return solve (n,dp);
    }
}