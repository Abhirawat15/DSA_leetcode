class Solution {
    public int reverse(int x) {
        int res = 0, rem = 0;
        while(x != 0) {
            rem = x % 10;
            x = x/10;
            if(Math.abs(res) > (Integer.MAX_VALUE- Math.abs(rem))/10) return 0;
            res = (res * 10) + rem;
        }
        
        return res;
    }
}