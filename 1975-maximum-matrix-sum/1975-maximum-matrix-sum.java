class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=100001, neg=0;
        boolean zero=false;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j]==0)
                    zero=true;
                int x=Math.abs(matrix[i][j]);
                if(x<min)
                    min=x;
                if(matrix[i][j]<0)
                    neg++;
                sum+=x;
            }
        }
        if(zero || neg%2==0)
            return sum;
        else
            return sum-(2*min);
    }
}