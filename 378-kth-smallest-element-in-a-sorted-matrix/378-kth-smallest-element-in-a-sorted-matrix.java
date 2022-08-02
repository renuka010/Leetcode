class Solution { // 18 ms, faster than 32.44%
    public int kthSmallest(int[][] matrix, int k) {
       int n=matrix.length, l=matrix[0][0], r=matrix[n-1][n-1], res=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(numslessorequal(mid,matrix,n)>=k){
                res=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return res;
    }
    public int numslessorequal(int x, int[][] matrix, int n){
        int count=0;
        for(int i=0, c=n-1; i<n; i++){
            while(c>=0 && matrix[i][c]>x)c--;
            count+=(c+1);
        }
        return count;
    }
}