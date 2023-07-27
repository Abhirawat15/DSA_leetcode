class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int curr=nums[0];
        int max=curr;
        for(int i=1;i<len;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            max=Math.max(curr,max);
        }
        return max;
    }
}