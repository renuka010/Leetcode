class Solution {
    boolean[][] visited;
    int l1,l2;
    public int numIslands(char[][] grid) {
        l1=grid.length;
        l2=grid[0].length;
        visited=new boolean[l1][l2];
        int count=0;
        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    markIsland(grid,i,j);
                }
            }
        }
        return count;
    }
    public void markIsland(char[][] grid, int x, int y){
        if(x<0 || x>=l1 || y<0 || y>=l2 || grid[x][y]=='0' || visited[x][y])
            return;
        visited[x][y]=true;
        markIsland(grid,x+1,y);
        markIsland(grid,x,y+1);
        markIsland(grid,x-1,y);
        markIsland(grid,x,y-1);
    }
}