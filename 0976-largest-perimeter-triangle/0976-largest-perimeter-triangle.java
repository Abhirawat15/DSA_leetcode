class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>1;--i){
            int third=nums[i];
            int second=nums[i-1];
            int first=nums[i-2];
            if(third < second+first)
                return third+second+first;
             }
        return 0;
    }
}