//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.checkFibonacci(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String checkFibonacci(int N){
        // code here
        int a=0;
        int b=1;
        int c=0;
        while(a<N){
            c=a+b;
            a=b;
            b=c;
        }
        if(a==N)
            return "Yes";
        return "No";
        
    }
}
