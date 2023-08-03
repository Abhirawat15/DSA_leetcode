class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int count=0;
        int max=0;
        for(int i=1;i<len;i++){
            int prev=nums[i-1];
            if(prev==nums[i]){
                count++;
            }else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max>=1?true:false;
    }
}