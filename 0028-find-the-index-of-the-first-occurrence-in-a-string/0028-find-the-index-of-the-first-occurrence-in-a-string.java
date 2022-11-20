class Solution {
    public int strStr(String haystack, String needle) {
        int len=haystack.length();
        int nlen=needle.length();
        for(int i=0;i<len-(nlen-1);i++){
            String ans=haystack.substring(i,i+nlen);
            if(ans.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}