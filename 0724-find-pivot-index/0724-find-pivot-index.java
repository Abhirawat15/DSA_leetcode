class Solution {
    public int check(int[] nums,int left,int right){
        int sum=0;
        while(left<right){
            sum+=nums[left]+nums[right];
            left++;
            right--;
        }
        
        if(left==right){
            sum+=nums[left];
        }
        return sum;
    }
    
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            int pivot=i;
            int leftSum=check(nums,0,pivot-1);
            int rightSum=check(nums,pivot+1,len-1);
            if(leftSum==rightSum){
                return pivot;
            }
        }
        return -1;
    }
}