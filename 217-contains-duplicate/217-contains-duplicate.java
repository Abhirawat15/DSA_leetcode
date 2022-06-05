class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        boolean flag=true;
        if(set.size()==nums.length){
            flag=false;
        }
        return flag;
    }
}