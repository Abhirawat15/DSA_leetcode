class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newA=nums1.length+nums2.length;
        int arr[]=new int[newA];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            arr[j]=nums1[i];
            j++;
        }
        
        for(int i=0;i<nums2.length;i++){
            arr[j]=nums2[i];
            j++;
        }
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        double ans=0;
        if(arr.length%2==0){
            ans=(arr[mid]+arr[mid+1]);
            ans/=2;
        }else{
            ans=arr[mid];
        }
        return ans;
    }
}