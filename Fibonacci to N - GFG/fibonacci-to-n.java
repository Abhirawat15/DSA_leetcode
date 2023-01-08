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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<Integer> ans=ob.nFibonacci(N);
            for(Integer u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList <Integer> nFibonacci(int N){
        //code here
        ArrayList<Integer> al=new ArrayList<>();
        int a=0;
        int b=1;
        int c=0;
        while(a<=N){
            c=a+b;
            al.add(a);
            a=b;
            b=c;
        }
        return al;
    }
}