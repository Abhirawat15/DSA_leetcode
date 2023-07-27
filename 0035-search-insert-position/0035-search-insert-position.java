class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        if(target<nums[0])
            return 0;
    
        
        for(int i=0;i<len;i++){
            if(nums[i]==target){
                return i;
            }
        }
        
        int idx=0;
        for(int i=0;i<len;i++){
            if(nums[i]<target){
                idx=i;
            }
        }
        return idx+1;
    }
}