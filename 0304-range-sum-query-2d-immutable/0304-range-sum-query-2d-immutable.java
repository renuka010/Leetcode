class NumMatrix {
    int[][] sum;

    public NumMatrix(int[][] matrix) {
        sum=new int[matrix.length+1][matrix[0].length+1];
        for(int i=matrix.length-1; i>=0; i--){
            for(int j=matrix[0].length-1; j>=0; j--){
                sum[i][j]+=matrix[i][j]+sum[i+1][j]+sum[i][j+1]-sum[i+1][j+1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row1][col1]-sum[row2+1][col1]-sum[row1][col2+1]+sum[row2+1][col2+1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */