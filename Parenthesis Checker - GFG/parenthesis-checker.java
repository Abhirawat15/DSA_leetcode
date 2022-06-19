// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    public static boolean check(Stack<Character> st, char ch){
        if(st.size()==0){
            return false;
        }else if(st.peek()!=ch){
            
            return false;
        }else{
            st.pop();
            return true;
        }
        
    }
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<>();
        boolean isFlag=true;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else if(ch==')'){
                isFlag=check(st,'(');
                if(isFlag==false){
                    return isFlag;
                }
            }else if(ch=='}'){
                isFlag=check(st,'{');
                if(isFlag==false){
                    return isFlag;
                }
            }else if(ch==']'){
                isFlag=check(st,'[');
                if(isFlag==false){
                    return isFlag;
                }
            }
        }
        
        if(st.size()!=0){
            isFlag=false;
        }  
        
        return isFlag;
    
    }
}
