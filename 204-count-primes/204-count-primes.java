class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[] dp=new boolean[n];
        if(n==0 || n==1 ||n==2)
            return 0;
        
        for(int i=2; i*i<n; i++){
            if(dp[i])
                continue;
            for(int j=i*i; j<n; j+=i){
                dp[j]=true;
            }
        }
        for(int i=2; i<n; i++){
            if(!dp[i])
                count++;
        }
        return count;
    }
}