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
            
            
            int[] coins = IntArray.input(br, N);
            
            Solution obj = new Solution();
            boolean res = obj.isPossible(N, coins);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends
class Solution 
{
    public static boolean solve (int N,int coins[],int i,int sum,int dp[][])
    {
        if (i==N)
        {
            if ((sum==2024 || sum%24==0 || sum%20==0)&&sum!=0)
            {
                return true;
            }
            return false;
        }
        if (dp[i][sum]!=-1) return dp[i][sum]==0?false:true;
        
        boolean take=solve(N,coins,i+1,sum+coins[i],dp);
        boolean nottake=solve(N,coins,i+1,sum,dp);
        
         dp[i][sum]=((take||nottake)==false)?0:1;
         return dp[i][sum]==0?false:true;
    }
    public static boolean isPossible(int N, int[] coins) 
    {
        // code here
        int dp[][]=new int [N+1][2025];
        for (int t[]:dp)Arrays.fill (t,-1);
        return solve (N,coins,0,0,dp);
    }
}
        
