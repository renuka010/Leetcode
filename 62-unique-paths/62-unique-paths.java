class Solution {
    public int uniquePaths(int m, int n) {
        int[] row=new int[n];
        Arrays.fill(row,1);
        for(int j=0; j<m-1; j++){
            for(int i=n-2; i>=0; i--)
                row[i]+=row[i+1];
        }
        return row[0];
    }
}