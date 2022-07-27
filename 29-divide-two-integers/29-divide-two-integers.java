class Solution {
    public int divide(int dividend, int divisor) {
        int count=0, min=Integer.MIN_VALUE;
        boolean isNeg=false;
        if(dividend==min && divisor==-1)
            return Integer.MAX_VALUE;
        else if(divisor==1)
            return dividend;
        else if(divisor==-1)
            return 0-dividend;
        else if(divisor==min)
            return (dividend==min)?1:0;
        
        if(dividend<0 && divisor<0){
            if(dividend==min){
                divisor=0-divisor;
                count++;
                dividend+=divisor;
                dividend=0-dividend;
            }
            else{
                dividend=0-dividend;
                divisor=0-divisor;
            }
        }
        else if(divisor<0){
            isNeg=true;
            divisor=0-divisor;
        }
        else if(dividend<0){
            isNeg=true;
            if(dividend==min){
                count++;
                dividend+=divisor;
                dividend=0-dividend;
            }
            else
                dividend=0-dividend;
        }
        while(dividend>=divisor){
            dividend-=divisor;
            count++;
        }
        return isNeg?0-count:count;
    }
}