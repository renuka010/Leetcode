class Solution {
    public int countHousePlacements(int n) {
        int value1=1, value2=2, result=2, i=2;
        while(i<=n){
            result=(value1+value2)%1000000007;
            value1=value2;
            value2=result;
            i++;
        }
        return (int)((1L*result*result)%1000000007);
    }
}