//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int count=0;
        int ans=0;
        if(N==1){
            return A[0];
        }
        if(A[0]!=A[1]){
            return A[0];
        }
        for(int i=1;i<N;i++){
            if(A[i-1]!=A[i]){
                count++;
                if(count==2){
                    ans=A[i-1];
                    return ans;
                }
            }else{
                count=0;
            }
        }
        if(A[N-1]!=A[N-2]){
            ans=A[N-1];
        }
        return ans;
    }
}