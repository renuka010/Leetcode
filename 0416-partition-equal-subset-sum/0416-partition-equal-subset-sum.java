class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;
        
        if(sum%2==1)
            return false;
        
        int n=sum/2;
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        
        for(int x:nums){
            for(int i=n-1; i>=0; i--){
                if(dp[i] && x+i<=n){
                    dp[x+i]=true;
                }
            }
            if(dp[n])
                return true;
        }
        
        return dp[n];
    }
}