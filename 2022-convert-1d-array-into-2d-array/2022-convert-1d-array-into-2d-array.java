class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result= new int[m][n];
        int[][] r=new int[0][0];
        if(m*n!=original.length)
            return r;
        int k=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[i][j]=original[k++];
            }
        }
        
        return result;
    }
}