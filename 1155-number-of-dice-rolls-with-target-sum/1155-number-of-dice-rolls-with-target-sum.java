class Solution {
    public int numRollsToTarget(int n, int k, int t) {
        if(t<n)
            return 0;
        if(t==n)
            return 1;
        int dp[][]=new int[n+1][t+1];
        dp[0][0]=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=t; j++){
                if(t>n*k || t<n)
                    continue;
                for(int x=1; x<=k && j-x>=0; x++)
                    dp[i][j]=(dp[i][j]+dp[i-1][j-x])%1000000007;
            }
        }
        return (dp[n][t]);
    }
}