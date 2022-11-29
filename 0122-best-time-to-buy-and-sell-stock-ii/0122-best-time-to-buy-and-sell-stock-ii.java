class Solution {
    public int maxProfit(int[] prices) {
        int prev1=0;
        for(int i=1; i<prices.length; i++){
            prev1=Math.max(prices[i]-prices[i-1]+prev1, prev1);
        }
        return prev1;
    }
}