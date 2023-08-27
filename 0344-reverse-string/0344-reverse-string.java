class Solution {
    public void reverseString(char[] s) {
        int len=s.length-1;
        int left=0;
        int right=len;
        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}