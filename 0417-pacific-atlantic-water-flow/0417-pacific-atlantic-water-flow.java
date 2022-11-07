class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length, n=heights[0].length;
        boolean[][] atl=new boolean[m][n];
        boolean[][] pac=new boolean[m][n];
        boolean[][] visit1=new boolean[m][n];
        boolean[][] visit2=new boolean[m][n];
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=0; i<n; i++)
            extend(0,i,pac,visit1,heights,heights[0][i]);
        for(int i=0; i<m; i++)
            extend(i,0,pac,visit1,heights,heights[i][0]);
        
        for(int i=0; i<n; i++)
            extend(m-1,i,atl,visit2,heights,heights[m-1][i]);
        for(int i=0; i<m; i++)
            extend(i,n-1,atl,visit2,heights,heights[i][n-1]);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(atl[i][j] && pac[i][j])
                    res.add(new ArrayList<Integer>(Arrays.asList(i,j)));
            }
        }
        
        return res;
    }
    
    public void extend(int x, int y, boolean[][] arr, boolean[][] visit, int[][] heights, int prev){
        if(x<0 || x>=heights.length || y<0 || y>=heights[0].length || visit[x][y])
            return;
        
        if(prev>heights[x][y])
            return;
        
        visit[x][y]=true;
        arr[x][y]=true;
        
        extend(x-1,y,arr,visit,heights,heights[x][y]);
        extend(x,y-1,arr,visit,heights,heights[x][y]);
        extend(x+1,y,arr,visit,heights,heights[x][y]);
        extend(x,y+1,arr,visit,heights,heights[x][y]);
    }
}