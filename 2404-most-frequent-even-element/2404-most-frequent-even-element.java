class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int maxInt=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    int freq=map.get(nums[i])+1;
                    map.put(nums[i],freq);
                }else{
                    map.put(nums[i],1);
                }
                
                if(map.get(nums[i])>max){
                    maxInt=nums[i];
                    max=map.get(nums[i]);
                }
            }
            
        }
        if(map.size()==0){
            maxInt=-1;
        }
        return maxInt;
        
    }
}