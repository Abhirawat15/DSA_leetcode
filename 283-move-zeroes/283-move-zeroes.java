class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[e]=nums[i];
                e--;
            }else{
                arr[s]=nums[i];
                s++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}