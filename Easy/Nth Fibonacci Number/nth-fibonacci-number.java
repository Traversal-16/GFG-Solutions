//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution 
{
    static int nthFibonacci(int n)
    {
        // code here
        int mod=(int)Math.pow (10,9)+7;
        int f=0;
        int s=1;
        if (n==1) return 0;
        if (n==2) return 1;
        
        int third=1;
        for (int i=3;i<=n+1;i++)
        {
            third=(f+s)%mod;
            f=s;
            s=third;
        }
        return third;
    }
}