class Solution {
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else{
                al.add(nums[i]);
            }
        }
        al.add(nums[nums.length-1]);
        if(al.size()<3){
            return al.get(al.size()-1);
        }
        return al.get(al.size()-3);
        
    }
}