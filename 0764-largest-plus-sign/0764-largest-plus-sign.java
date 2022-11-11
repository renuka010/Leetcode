class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] left=new int[n][n];
        int[][] right=new int[n][n];
        int[][] top=new int[n][n];
        int[][] down=new int[n][n];
        int max=1;
        
        for(int i=0; i<mines.length; i++){
            int x=mines[i][0], y=mines[i][1];
            left[x][y]=1;
            right[x][y]=1;
            top[x][y]=1;
            down[x][y]=1;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    if(left[i][j]!=1)
                        left[i][j]=2;
                    continue;
                }
                if(left[i][j]!=1)
                    left[i][j]=left[i][j-1]+1;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(j==n-1){
                    if(right[i][j]!=1)
                        right[i][j]=2;
                    continue;
                }
                if(right[i][j]!=1)
                    right[i][j]=right[i][j+1]+1;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(j==n-1){
                    if(down[j][i]!=1)
                        down[j][i]=2;
                    continue;
                }
                if(down[j][i]!=1)
                    down[j][i]=down[j+1][i]+1;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    if(top[j][i]!=1)
                        top[j][i]=2;
                    continue;
                }
                if(top[j][i]!=1)
                    top[j][i]=top[j-1][i]+1;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int min=Math.min(Math.min(left[i][j],right[i][j]),Math.min(down[i][j],top[i][j]));
                if(min>max)
                    max=min;
            }
        }
        return max-1;
    }
}