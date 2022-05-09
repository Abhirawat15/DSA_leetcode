class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=nums1.length-1,j=0;i>m-1 && j<n;i--,j++){
                nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}