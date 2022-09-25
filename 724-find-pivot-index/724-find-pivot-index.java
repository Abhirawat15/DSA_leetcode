class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pivot=0;
        int ls=0;
        int rs=0;
        for(int i=1;i<n;i++){
            rs+=nums[i];
        }
        
        if(ls==rs){
            return pivot;
        }else{
            for(int i=1;i<n;i++){
                pivot=i;
                ls+=nums[i-1];
                rs=rs-nums[pivot];
                
                if(ls==rs){
                    return pivot;
                }
            }
            
        }
        return -1;
    }
}