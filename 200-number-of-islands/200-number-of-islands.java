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
        visited[i][j]=true;
        Queue<int[]> q=new LinkedList<>();
        int[][] x=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        q.offer(new int[]{i,j});
        while(!q.isEmpty()){
            int[] n=q.poll();
            for(int k=0; k<4; k++){
                int[] a=new int[2];
                a[0]=n[0]+x[k][0];
                a[1]=n[1]+x[k][1];
                if(!(a[0]<0||a[1]<0||a[0]>=grid.length||a[1]>=grid[0].length||visited[a[0]][a[1]]||grid[a[0]][a[1]]=='0')){
                    visited[a[0]][a[1]]=true;
                    q.offer(a);
                }
            }    
        }
    }
}