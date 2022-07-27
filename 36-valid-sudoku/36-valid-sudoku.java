class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++){
            
            boolean nums[]=new boolean[9];
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    if(nums[board[i][j]-49]==true)
                        return false;
                    nums[board[i][j]-49]=true;
                }
            }
            
            boolean nums2[]=new boolean[9];
            for(int j=0; j<9; j++){
                if(board[j][i]!='.'){
                    if(nums2[board[j][i]-49]==true)
                        return false;
                    nums2[board[j][i]-49]=true;
                }
            }
            
            boolean nums3[]=new boolean[9];
            for(int j=(i/3)*3; j<(i/3)*3+3; j++){
                for(int k=(i%3)*3; k<(i%3)*3+3; k++){
                    if(board[j][k]!='.'){
                        if(nums3[board[j][k]-49]==true)
                            return false;
                        nums3[board[j][k]-49]=true;
                    }
                }
            }
        }
        return true;
    }
}