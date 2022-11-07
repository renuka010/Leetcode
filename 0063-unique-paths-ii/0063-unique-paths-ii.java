class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[][] dp=new int[m][n];
        if(grid[m-1][n-1]==0)
            dp[m-1][n-1]=1;
        else
            dp[m-1][n-1]=0;
        
        for(int i=m-1, j=n-2; j>=0; j--){
            if(grid[i][j]==1)
                dp[i][j]=0;
            else
                dp[i][j]=dp[i][j+1];
        }
        
        for(int i=m-2; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(j==n-1){
                    if(grid[i][j]==1)
                        dp[i][j]=0;
                    else
                        dp[i][j]=dp[i+1][j];
                }
                else{
                    if(grid[i][j]==1)
                        dp[i][j]=0;
                    else
                        dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
}