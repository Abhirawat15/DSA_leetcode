class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int j=0;
        for(int i=1;i<len;i++){
            if(nums[j]!=nums[i]){
                int temp=nums[j+1];
                nums[j+1]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return j+1;
    }
}