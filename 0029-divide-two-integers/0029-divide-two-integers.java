class Solution {
    public int divide(int dividend, int divisor) {
        int ans=dividend/divisor;
        if(ans==(int)Integer.MIN_VALUE && divisor<0){
            return (int)Integer.MAX_VALUE;
        }
        return ans;
    }
}