class Solution {
    public boolean isPalindrome(int x) {
        int count=0;
        int old=x;
        int temp=x;
        
        while(temp>0){
            temp/=10;
            count++;
        }
        
        boolean flag=true;
        int ans=0;
        while(count>0){
            int rem=x%10;
            x/=10;
            ans+=rem*(int)Math.pow(10,count-1);
            count--;
        }
        
        if(ans!=old){
            flag=false;
        }
        return flag;
    }
}