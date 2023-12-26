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
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        ArrayList<ArrayList<Integer>> l=new ArrayList <>();
        
        for (int i=0;i<(matrix.length+matrix[0].length);i++)
        {
            l.add(new ArrayList <>());
        }
        
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                l.get(i+j).add(matrix[i][j]);
            }
        }
        int ans[]=new int [matrix.length * matrix[0].length];
        int c=-1;
        for (int i=0;i<l.size();i++)
        {
            for (int j=0;j<l.get(i).size();j++)
            {
                ans[++c]=l.get(i).get(j);
            }
        }
        return ans;
    }
}