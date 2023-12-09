//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public long r (int coins[],int sum,int i,long dp[][])
    {
        if (i==coins.length && sum==0)
        {
            return 1;
        }
        if ((i==coins.length && sum!=0 )||(sum<0)) return 0;
        if (sum>0 &&dp[sum][i]!=-1) return dp[sum][i];
        
        return dp[sum][i]=r(coins,sum-coins[i],i,dp)+r(coins,sum,i+1,dp);
    }
    public long count(int coins[], int N, int sum) 
    {
        // code here.
        long dp[][]=new long [sum+1][N+1];
        for (long t[]:dp)
        {
            Arrays.fill (t,-1);
        }
        return r (coins,sum,0,dp);
    }
}