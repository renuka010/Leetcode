class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length, n=grid[0].length, res=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1)
                    res=Math.max(res,dfs(grid,i,j,m,n));
            }
        }
        return res;
    }
    public int dfs(int[][] grid, int i, int j, int m, int n){
        if(grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        int up=0,down=0,left=0,right=0;
        if(i!=0)
            up=dfs(grid,i-1,j,m,n);
        if(i!=m-1)
            down=dfs(grid,i+1,j,m,n);
        if(j!=0)
            left=dfs(grid,i,j-1,m,n);
        if(j!=n-1)
            right=dfs(grid,i,j+1,m,n);
        return left+right+up+down+1;
    }
}