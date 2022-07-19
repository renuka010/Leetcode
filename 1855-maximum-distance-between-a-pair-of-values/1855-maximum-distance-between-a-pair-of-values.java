class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=nums1.length-1, j=nums2.length-1, res=0;
        while(j>=0 && i>=0){
            while(i>=0 && nums1[i]<=nums2[j]){
                res=Math.max(res,j-i);
                i--;
            }
            while(i>=0 && j>-1 && nums1[i]>nums2[j])
                j--;
        }
        return res;
    }
}