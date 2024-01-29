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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int solve (String str,int ind,int sum,int dp[][])
    {
        if (ind==str.length ())
        {
            return 1;
        }
        if (dp[ind][sum]!=-1) return dp[ind][sum];
        int ans=0;
        int cur=0;
        for (int i=ind;i<str.length ();i++)
        {
            cur+=str.charAt (i)-'0';
            if (cur>=sum)
            {
                ans+=solve (str,i+1,cur,dp);
            }
        }
        return dp[ind][sum]=ans;
    }
    public int TotalCount(String str)
    {
        // Code here
        
        int dp[][]=new int [str.length()][901];
        for (int t[]:dp) Arrays.fill (t,-1);
        return solve (str,0,0,dp);
    }
}