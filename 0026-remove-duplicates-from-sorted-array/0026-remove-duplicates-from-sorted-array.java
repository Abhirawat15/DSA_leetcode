class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st=new Stack<>();
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(st.peek()!=nums[i]){
                st.push(nums[i]);
            }
        }
        
        int size=st.size();
        int ind=st.size()-1;
        while(ind >= 0){
            nums[ind--]=st.pop();
        }
        return size;
    }
}