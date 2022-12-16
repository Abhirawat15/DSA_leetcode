//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int check(int N){
        int dig=0;
        while(N>0){
            int rem=N%10;
            dig+=rem;
            N=N/10;
        }
        return dig;
    }
    
    static String NewString(int N,String ans,int digg){
        if(N%2==0){
            int total=N/2;
            for(int i=0;i<total;i++){
                ans+=(char)('a'+i);
            }
            
            int rtot=26-total;
            for(int i=0;i<total;i++){
                ans+=(char)('a'+rtot+i);
            }
            // System.out.println(ans);
        }else{
            if(digg%2==0){
                int start=(N+1)/2;
                int end=(N-1)/2;
                for(int i=0;i<start;i++){
                    ans+=(char)('a'+i);
                }
                int rtot2=26-end;
                for(int i=0;i<end;i++){
                    ans+=(char)('a'+rtot2+i);
                }
                
            }else{
                int start=(N-1)/2;
                int end=(N+1)/2;
                for(int i=0;i<start;i++){
                    ans+=(char)('a'+i);
                }
                int rtot2=26-end;
                for(int i=0;i<end;i++){
                    ans+=(char)('a'+rtot2+i);
                }
                // System.out.println(ans);
            }
            
            
            
        }
        return ans;
    }
    
    static String BalancedString(int N) {
        // code here
        String fin="";
        int digg=check(N);
        while(N>26){
            fin+="abcdefghijklmnopqrstuvwxyz";
            N=N-26;
        }
        String ffin=NewString(N,fin,digg);
        
        
        //Start
        
        return ffin;
    }
}