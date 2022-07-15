class Solution {
    boolean[][] seen;
    public int islandPerimeter(int[][] grid) {
        this.seen=new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1)
                    return dfs(grid,i,j);
            }
        }
        return -1;
    }
    public int dfs(int[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0)
            return 1;
        if(seen[i][j])
            return 0;
        seen[i][j]=true;
        return (dfs(grid,i+1,j) + dfs(grid,i-1,j) + dfs(grid,i,j+1) + dfs(grid,i,j-1));
    }
}