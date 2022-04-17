// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static String common(String a,String b)
    {
        String sol="";
        for(int i=0;i<Math.min(a.length(),b.length());i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                sol+=a.charAt(i);
            }
            else
            {
                break;
            }
        }
        return sol;
    }
    
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans= arr[0];
        for(int i=1;i<n;i++)
        {
            ans=common(ans,arr[i]);
        }
       if(ans.isEmpty())
         return "-1";
        
     return ans; 
    }
}