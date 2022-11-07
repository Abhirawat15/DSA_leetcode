// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int div=size/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxFreq=0;
        int maxNum=0;
        
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                int freq=map.get(a[i]);
                freq+=1;
                map.put(a[i],freq);
            }else{
                map.put(a[i],1);
            }
            
            
            if(map.get(a[i])>maxFreq){
                maxFreq=map.get(a[i]);
                maxNum=a[i];
            }
            
        }
        
        
        
        if(maxFreq>div){
            return maxNum;
        }
        return -1;
    }
}