class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid[0].length, m=grid.length;
        int[] row=new int[n];
        row[n-1]=grid[m-1][n-1];
        for(int i=n-2; i>=0; i--)
            row[i]+=grid[m-1][i]+row[i+1];
        
        for(int i=m-2; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(j==n-1)
                    row[j]+=grid[i][j];
                else
                    row[j]=grid[i][j]+Math.min(row[j+1],row[j]);
            }
        }
        return row[0];
    }
}