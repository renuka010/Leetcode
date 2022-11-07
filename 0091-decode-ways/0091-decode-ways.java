class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        for(int i=s.length()-1; i>=0; i--){
            char c=s.charAt(i);
            if(c=='0'){
                dp[i]=0;
                continue;
            }
            if(i==s.length()-1){
                dp[i]=1;
                continue;
            }
            char next=s.charAt(i+1);
            if((c=='1')||(c=='2' && next>='0' && next<='6')){
                if(i+2!=s.length())
                    dp[i]=dp[i+1]+dp[i+2];
                else
                    dp[i]=dp[i+1]+1;
            }
            else
                dp[i]=dp[i+1];
            
        }
        return dp[0];
    }
}