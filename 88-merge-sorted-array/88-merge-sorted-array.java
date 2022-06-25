class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1;
        while(true){
            if(j==-1)
                break;
            else if(i==-1){
                while(j!=-1) nums1[j]=nums2[j--];
                break;
            }
            nums1[i+j+1]=(nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        }
    }
}