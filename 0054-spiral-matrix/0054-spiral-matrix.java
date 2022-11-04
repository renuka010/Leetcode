class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        List<Integer> res=new ArrayList<>();
        int k=0;
        boolean up=true;
        while(up){
            boolean right=false,down=false,left=false;
            up=false;
            for(int i=k; i<n-k; i++){
                res.add(matrix[k][i]);
                right=true;
            }
            for(int i=k+1; i<m-k; i++){
                if(!right)
                    break;
                res.add(matrix[i][n-k-1]);
                down=true;
            }
            for(int i=n-2-k; i>=k; i--){
                if(!down)
                    break;
                res.add(matrix[m-k-1][i]);
                left=true;
            }
            for(int i=m-2-k; i>k; i--){
                if(!left)
                    break;
                res.add(matrix[i][k]);
                up=true;
            }
            k++;
        }
        return res;
    }
}