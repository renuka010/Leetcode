class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] coinsForAmt= new int[amount+1];
        Arrays.fill(coinsForAmt,amount+1);
        Arrays.sort(coins);
        coinsForAmt[0]=0;
        
        for(int i=1; i<=amount; i++){
            for(int coin: coins){
                if(coin>i)
                    break;
                coinsForAmt[i]=Math.min(coinsForAmt[i-coin]+1,coinsForAmt[i]);
            }
        }
        return (coinsForAmt[amount]==amount+1)?-1:coinsForAmt[amount];
    }
}