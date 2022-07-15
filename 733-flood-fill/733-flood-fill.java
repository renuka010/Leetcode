class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int t=image[sr][sc];
        if (color==t)
            return image;
        dfs(image,sr,sc,color,t);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int color, int t){
        if(i<0||j<0||i==image.length||j==image[0].length||image[i][j]!=t)
            return;
        image[i][j]=color;
        dfs(image,i+1,j,color,t);
        dfs(image,i-1,j,color,t);
        dfs(image,i,j+1,color,t);
        dfs(image,i,j-1,color,t);
    }
}