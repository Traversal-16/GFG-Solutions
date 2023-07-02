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
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nearestPowerOf2(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nearestPowerOf2(long N){
        //code here
        long a = (int)(Math.log(N) / Math.log(2));
 
        if (Math.pow(2, a) == N)
            return N;
 
        return (long) Math.pow(2, a + 1);
    }
}