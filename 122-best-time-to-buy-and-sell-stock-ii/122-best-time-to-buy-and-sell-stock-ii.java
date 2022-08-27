class Solution {
    public int maxProfit(int[] prices) {
        int start=prices[0], end=prices[0], profit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>end){
                end=prices[i];
            }
            else{
                profit+=(end-start);
                start=prices[i];
                end=start;
            }
        }
        profit+=(end-start);
        return profit;
    }
}