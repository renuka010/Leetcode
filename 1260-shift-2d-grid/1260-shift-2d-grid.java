class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length, n=grid[0].length;
        k=k%(m*n);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0; i<m; i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0; j<n; j++){
                int index=(findIndex(i,j,n)-k+m*n)%(m*n);
                a.add(grid[index/n][index%n]);
            }
            res.add(a);
        }
        return res;
    }
    public int findIndex(int i, int j, int n){
        return i*n+j;
    }
}