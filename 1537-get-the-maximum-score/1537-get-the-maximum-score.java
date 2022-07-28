class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long n1=0, n2=0;
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(n1>n2){
                    n2=(n1+nums1[i]);
                    n1=n2;
                }
                else{
                    n1=(n2+nums1[i]);
                    n2=n1;
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                n1=(n1+nums1[i++]);
            else
                n2=(n2+nums2[j++]);
        }
        while(i<nums1.length)
            n1=(n1+nums1[i++]);
        while(j<nums2.length)
            n2=(n2+nums2[j++]);
        
        return (n1>n2)?(int)(n1%1000000007):(int)(n2%1000000007);
    }
}