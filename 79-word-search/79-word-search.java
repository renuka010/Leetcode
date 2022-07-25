class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length, n=board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(word.charAt(0)==board[i][j]){
                    if(find(board,word,i,j,new boolean[m][n],0))
                        return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board, String word,int i,int j,boolean[][] visited,int index){
        if(word.length()==index)
            return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(index))
            return false;
        visited[i][j]=true;
        boolean res= find(board,word,i+1,j,visited,index+1)||find(board,word,i-1,j,visited,index+1)||find(board,word,i,j+1,visited,index+1)||find(board,word,i,j-1,visited,index+1);
        visited[i][j]=false;
        return res;
    }
}