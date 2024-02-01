//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) 
    {
        // your code here
        
        HashMap<Integer,Integer> hmap=new HashMap <>();
        for (int i=0;i<s.length ();i++)
        {
            int a=(s.charAt (i));
            if(a>=97 && a<=122)
            {
                hmap.put(a,0);
            }
            else if (a>=65 && a<=90)
            {
                hmap.put (a+32,0);
            }
        }
        return (hmap.size()==26);
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends