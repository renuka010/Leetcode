class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] x=new int[primes.length];
        long[] dp=new long[n];
        dp[0]=1;
        Arrays.fill(x,0);
        
        for(int i=1; i<n; i++){
            long min=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0; j<primes.length; j++){
                long m=primes[j]*dp[x[j]];
                if(m==min){
                    x[j]++;
                    continue;
                }
                if(m<min){
                    min=m;
                    index=j;
                }
            }
            dp[i]=min;
            x[index]++;
        }
        return (int)dp[n-1];
    }
}