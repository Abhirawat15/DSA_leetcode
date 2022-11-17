class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i])+1;
                map.put(nums[i],freq);
            }else{
                map.put(nums[i],1);
            }
        }
        
        int max=0;
        int value=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>value){
                max=nums[i];
                value=map.get(nums[i]);
            }
        }
        return max;
    }
}