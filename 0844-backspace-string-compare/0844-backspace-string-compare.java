class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(st.size()>0) 
                    st.pop();
            }else{
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            a+=st.pop();
        }
        
        Stack<Character> st2=new Stack<>();
        
        String b="";
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if(st2.size()>0) 
                    st2.pop();
            }else{
                st2.push(ch);
            }
        }
        
        while(!st2.isEmpty()){
            b+=st2.pop();
        }
        
        
        return a.equals(b)?true:false;
    }
}