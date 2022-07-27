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
        if(dividend==min){
            if(divisor==min)
                return 1;
            else if(divisor<0){
                divisor=0-divisor;
                isNeg=!isNeg;
            }
            dividend+=divisor;
            dividend=0-dividend;
            count++;
            isNeg=!isNeg;
        }
        else if(divisor==min)
            return 0;
        else if(dividend<0 && divisor<0){
            dividend=0-dividend;
            divisor=0-divisor;
        }
        else if(divisor<0){
            isNeg=true;
            divisor=0-divisor;
        }
        else if(dividend<0){
            isNeg=true;
            dividend=0-dividend;
        }
        while(dividend>=divisor){
            dividend-=divisor;
            count++;
        }
        return isNeg?0-count:count;
    }
}