class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxdiff=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>maxdiff)
                maxdiff=prices[i]-min;
            else if(prices[i]<min)
                min=prices[i];
        }
        return maxdiff;
    }
}