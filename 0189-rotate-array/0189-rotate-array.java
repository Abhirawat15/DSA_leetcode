class Solution {
    public void rotateNum(int[] nums, int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(k<0){
            k+=n;
        }
        if(k>=n){
            k=k%n;
        }
        rotateNum(nums,left,right);
        rotateNum(nums,left,k-1);
        rotateNum(nums,k,right);
    }
}