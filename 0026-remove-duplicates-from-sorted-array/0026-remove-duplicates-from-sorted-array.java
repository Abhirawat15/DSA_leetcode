class Solution {
    public int removeDuplicates(int[] nums) {
        
        int sz=nums.length;
        int i=0;
        int k=1;
        if(sz>1){
            while(k<sz){
                if(nums[i]==nums[k]){
                }else{
                    nums[i+1]=nums[k];
                    i++;
                }
                k++;
            }
        }
        
        int arr[]=new int[i+1];
        for(int j=0;j<i+1;j++){
            arr[j]=nums[j];
        }
        
        nums=new int[i+1];
        for(int j=0;j<i+1;j++){
            nums[j]=arr[j];
        }
        
        return i+1;
    }
}