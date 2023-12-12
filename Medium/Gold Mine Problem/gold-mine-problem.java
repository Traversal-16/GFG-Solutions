//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int solve (int n,int m,int i,int j,int M[][],int dp[][])
    {
        if (i<0||i>=n || j>=m) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int o1=M[i][j]+solve (n,m,i-1,j+1,M,dp);
        int o2=M[i][j]+solve (n,m,i,j+1,M,dp);
        int o3=M[i][j]+solve (n,m,i+1,j+1,M,dp);
        
        return dp[i][j]=Math.max (o1,Math.max(o2,o3));
    }
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int ans=0;
        int dp[][]=new int [n][m];
        for (int t[]:dp) Arrays.fill (t,-1);
        for (int i=0;i<n;i++)
        {
            
            ans=Math.max (ans,solve(n,m,i,0,M,dp));
        }
        return ans;
    }
}