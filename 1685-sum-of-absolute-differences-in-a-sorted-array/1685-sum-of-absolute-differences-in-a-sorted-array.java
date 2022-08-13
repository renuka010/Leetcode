class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0, n=nums.length;
        int ans[]=new int[n];
        for(int i:nums)
            sum+=i;
        sum=sum-n*nums[0];
        ans[0]=sum;
        for(int i=1; i<n; i++){
            int x=nums[i]-nums[i-1];
            sum+=(x*(i-1));
            sum-=(x*(n-1-i));
            ans[i]=sum;
        }
        return ans;
    }
}