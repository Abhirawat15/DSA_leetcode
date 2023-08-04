class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int i=0;
        for(;i<len;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return i;
    }
}