class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int count=0;
        Arrays.sort(nums);
        int max=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev==nums[i]){
                count++;
            }else{
                prev=nums[i];
                count=1;
            }
            max=Math.max(count,max);
        }
        return nums[max-1];
    }
}