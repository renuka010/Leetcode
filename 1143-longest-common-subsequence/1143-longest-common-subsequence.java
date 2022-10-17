class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length(), l2=text2.length();
        int[][] dp=new int[l1+1][l2+1];
        
        for(int i=l1; i>=0; i--){
            dp[i][l2]=0;
        }
        for(int i=0; i<=l2; i++){
            dp[l1][i]=0;
        }
        for(int i=l1-1; i>=0; i--){
            for(int j=l2-1; j>=0; j--){
                if(text1.charAt(i)==text2.charAt(j))
                    dp[i][j]=dp[i+1][j+1]+1;
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}