class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--; 
        n--;
        while(true){
            if(n==-1)
                break;
            else if(m==-1){
                while(n!=-1) nums1[n]=nums2[n--];
                break;
            }
            nums1[m+n+1]=(nums1[m]>nums2[n])?nums1[m--]:nums2[n--];
        }
    }
}