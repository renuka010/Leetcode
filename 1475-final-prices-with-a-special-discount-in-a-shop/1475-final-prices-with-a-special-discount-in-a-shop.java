class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s=new Stack<>();
        int[] res=prices;
        for(int i=0; i<prices.length; i++){
            while(!s.isEmpty() && prices[i]<=prices[s.peek()]){
                res[s.peek()]-=prices[i];
                s.pop();
            }
            s.push(i);
        }
        return res;
    }
}