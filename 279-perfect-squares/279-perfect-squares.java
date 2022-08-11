class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        if(n<=3)
            return n;
        dp[0]=0;
        for(int i=1; i<=n; i++){
            dp[i]=i;
            for(int j=1; j*j<=i; j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}