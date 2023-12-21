//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution 
{
    static int minCandy(int N, int ratings[]) 
    {
        // code here
        int ans[]=new int [N];
        Arrays.fill (ans,1);
        for (int i=1;i<ratings.length;i++)
        {
            if (ratings[i]>ratings[i-1])
            {
                ans[i]=ans[i-1]+1;
            }
        }
        
        for (int i=ratings.length-2;i>=0;i--)
        {
            if (ratings[i]>ratings[i+1])
            {
                ans[i]=Math.max(ans[i],ans[i+1]+1);
            }
        }
        int sum=0;
        for (int i=0;i<N;i++)
        {
            sum+=ans[i];
        }
        return sum;
    }
}
