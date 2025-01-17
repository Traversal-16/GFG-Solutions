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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        String rev="";
        for (int i=S.length()-1;i>=0;i--)
        {
            rev+=S.charAt (i);
        }
        
        int n=S.length();
        int dp[][]=new int [n+1][n+1];
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if (S.charAt (i-1)==rev.charAt (j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max (dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][n];
    }
}