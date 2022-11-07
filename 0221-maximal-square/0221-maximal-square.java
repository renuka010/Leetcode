class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[][] dp=new int[m][n];
        int i=m-1, j, max=0;
        for(j=n-1; j>=0; j--){
            dp[i][j]=matrix[i][j]-48;
            if(dp[i][j]>max)
                max=dp[i][j];
        }
        for(i=m-2, j=n-1; i>=0; i--){
            dp[i][j]=matrix[i][j]-48;
            if(dp[i][j]>max)
                max=dp[i][j];
        }
        for(i=m-2; i>=0; i--){
            for(j=n-2; j>=0; j--){
                if(matrix[i][j]=='1')
                    dp[i][j]=Math.min(dp[i+1][j+1], Math.min(dp[i+1][j],dp[i][j+1]))+1;
                else
                    dp[i][j]=0;
                if(dp[i][j]>max)
                    max=dp[i][j];
            }
        }
        return max*max;
    }
}