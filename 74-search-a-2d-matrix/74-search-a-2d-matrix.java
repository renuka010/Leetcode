class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length*matrix[0].length;
        int l=0, r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            int val=value(matrix,mid);
            if(val==target)
                return true;
            else if(val>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return false;
    }
    public int value(int[][] matrix, int mid){
        int row=mid/matrix[0].length;
        int col=mid%matrix[0].length;
        return matrix[row][col];
    }
}