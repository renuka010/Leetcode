class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        return helper(dp,n);
    }
    public int helper(int[] dp, int n){
        
        if(dp[n]!=0)
            return dp[n];
        int temp=0;
        for(int i=0; i<n; i++){
            int left=i;
            int right=n-i-1;
            temp+=helper(dp,left)*helper(dp,right);
        }
        dp[n]+=temp;
        return dp[n];
    }
}