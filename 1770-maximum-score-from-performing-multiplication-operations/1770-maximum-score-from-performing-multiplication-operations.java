class Solution {
    public int maximumScore(int[] nums, int[] mul) {
        int dp[][]=new int[mul.length][mul.length];
        return findSum(nums,mul,0,0,dp);
    }
    
    public int findSum(int[] nums, int[] mul, int l, int op, int[][] dp){
        if(op==mul.length)
            return 0;
        if(dp[l][op]!=0){
            return dp[l][op];
        }
        else{
            dp[l][op] = Math.max(findSum(nums,mul,l+1,op+1,dp)+nums[l]*mul[op],findSum(nums,mul,l,op+1,dp)+nums[nums.length-(op-l)-1]*mul[op]);
            return dp[l][op];
        }
    }
}