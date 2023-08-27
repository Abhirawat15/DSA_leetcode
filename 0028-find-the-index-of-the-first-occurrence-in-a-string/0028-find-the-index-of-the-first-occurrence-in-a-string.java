class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen=haystack.length();
        int len=needle.length();
        int i=0;
        while(len <= hayLen){
            String sub=haystack.substring(i,len);
            if(sub.equals(needle)){
                return i;
            }
            len++;
            i++;
        }
        return -1;
    }
}