class Solution {
    int[] dp;
    int[] d;
    int[] num;
    int[] cost;
    public int mincostTickets(int[] days, int[] costs) {
        d=new int[]{1,7,30};
        dp=new int[days.length];
        Arrays.fill(dp,365001);
        num=days;
        cost=costs;
        return minCost(0);
    }
    public int minCost(int x){
        if(x>=dp.length)
            return 0;
        if(dp[x]!=365001)
            return dp[x];
        int j=x;
        for(int i=0; i<3; i++){
            while(j<num.length && num[j]<num[x]+d[i])
                j++;
            dp[x]=Math.min(dp[x],minCost(j)+cost[i]);
        }
        return dp[x];
    }
}