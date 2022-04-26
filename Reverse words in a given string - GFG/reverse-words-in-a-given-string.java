// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
      StringBuilder sb = new StringBuilder(S.length());
       int l = S.length();
       for(int i = S.length() - 1; i>-1; --i) {
           if(S.charAt(i) == '.') {
               sb.append(S.substring(i+1, l));
               if(i!=-1){
                  sb.append('.');
               }
               l = i;
           }
       }
       sb.append(S.substring(0, l));
       return sb.toString();
    }
}