// { Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    boolean isNotDuplicate(String a, char ch){
        boolean flag=true;
            for(int i=0;i<a.length();i++){
                if(ch==a.charAt(i)){
                    flag=false;
                    return flag;
            }
        }
        return flag;
        
    }
    
    String removeDuplicates(String str) {
        String a=str.charAt(0)+"";
        
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(isNotDuplicate(a,ch)){
                a=a+ch;
            }
        }
        return a;
    }
}

