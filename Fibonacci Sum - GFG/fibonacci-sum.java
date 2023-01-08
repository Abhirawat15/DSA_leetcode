//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long N){
        //code here
        long a=0;
        long b=1;
        long sum=0;
        for(long i=0;i<=N;i++){
            long c=(a+b)%1000000007;
            sum=(sum+a)%1000000007;
            a=b%1000000007;
            b=c%1000000007;
        }
        return sum%1000000007 ;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends