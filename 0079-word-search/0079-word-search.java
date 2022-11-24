class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length, n=board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,i,j,word,0, new boolean[m][n]))
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean search(char[][] board, int x, int y, String word, int index, boolean[][] visited){
        if(index==word.length())
            return true;
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || visited[x][y] || board[x][y]!=word.charAt(index))
            return false;
        
        visited[x][y]=true;
        
        boolean res= search(board,x+1,y,word,index+1,visited)||search(board,x-1,y,word,index+1,visited)||search(board,x,y+1,word,index+1,visited)||search(board,x,y-1,word,index+1,visited);
        
        visited[x][y]=false;
        
        return res;
    }
}