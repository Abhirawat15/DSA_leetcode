class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(nums[n-1]<target){
            return n;
        }
        if(nums[0]>target){
            return 0;
        }
        
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                if(nums[mid-1]<target){
                    return mid;
                }
                right=mid-1;
            }else{
                if(nums[mid+1]>target){
                    return mid+1;
                }
                left=mid+1;
            }
        }
        
        return 0;
    }
}