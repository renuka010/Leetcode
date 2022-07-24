class Solution {
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    visitIsland(grid,i,j);
                }
            }
        }
        return count;
    }
    public void visitIsland(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ||visited[i][j] ||grid[i][j]=='0')
            return;
        else{
            visited[i][j]=true;
            visitIsland(grid,i-1,j);
            visitIsland(grid,i+1,j);
            visitIsland(grid,i,j-1);
            visitIsland(grid,i,j+1);
        }
    }
}