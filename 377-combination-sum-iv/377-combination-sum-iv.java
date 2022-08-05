class Solution {
    
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] dp=new int[target+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        int t=1;
        while(t!=target+1){
            for(int i=0; i<nums.length && nums[i]<=t; i++){
                dp[t]+=dp[t-nums[i]];
            }
            t++;
        }
        return dp[target];
    }
}