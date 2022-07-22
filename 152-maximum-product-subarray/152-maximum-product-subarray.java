class Solution {
    public int maxProduct(int[] nums) {
        int maxp=1, minp=1, res=nums[0];
        for(int n:nums){
            int temp=maxp;
            maxp=Math.max(maxp*n,Math.max(n,minp*n));
            minp=Math.min(temp*n,Math.min(n,minp*n));
            res=Math.max(res,maxp);
        }
        return res;
    }
}