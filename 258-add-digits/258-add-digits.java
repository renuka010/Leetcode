class Solution {
    public int addDigits(int n) {
        int sum=0;
        if(n==0)
            return 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum%9==0)
            return 9;
        return sum%9;
    }
}