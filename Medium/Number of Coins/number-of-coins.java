//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution
{
    public int dp(int coins[],int M,int V,int i,int dp1[][])
    {
        if (V<0) return (int) 1e9;
        if (i==coins.length)
        {
            if (V==0)
            {
                return 0;
            }
            return (int)1e9;
        }
        if(dp1[i][V]!=-1) return dp1[i][V];
        int take=(int) 1e9;
        if (coins[i]<=V)
        {
            take=1+dp(coins,M,V-coins[i],i,dp1);
        }
        int nottake=dp(coins,M,V,i+1,dp1);
        
        return dp1[i][V]=Math.min(take,nottake);
    }

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int cazz[][]=new int [M][V+1];
	    for (int t[]:cazz) Arrays.fill (t,-1);
	    int y= dp(coins,M,V,0,cazz);
	    if(y==(int)1e9) return -1;
	    return y;
	    
	} 
}