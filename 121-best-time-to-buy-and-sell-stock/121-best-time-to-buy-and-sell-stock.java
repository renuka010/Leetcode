class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxdiff=0;
        for(int i=1;i<prices.length;i++){
            maxdiff=Math.max(maxdiff,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return maxdiff;
    }
}