class Solution {
    public long gridGame(int[][] grid) {
        long leftSum=0, rightSum=0;
        int i=1;
        for(; i<grid[0].length; i++){
            rightSum+=grid[0][i];
        }
        long max=rightSum;
        for(i=0; i<grid[0].length-1; i++){
            leftSum+=grid[1][i];
            rightSum-=grid[0][i+1];
            max=Math.min(max,Math.max(leftSum,rightSum));
        }
        return max;
    }
}