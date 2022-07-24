class Solution {
    public void rotate(int[][] mat) {
        int l=0, r=mat.length-1, top=l, bottom=r;
        while(l<r){
            for(int i=0; i<(r-l); i++){
                int topleft=mat[top][l+i];
                mat[top][l+i]=mat[bottom-i][l];
                mat[bottom-i][l]=mat[bottom][r-i];
                mat[bottom][r-i]=mat[top+i][r];
                mat[top+i][r]=topleft;
            }
            l++;
            r--;
            top++;
            bottom--;
        }
    }
}