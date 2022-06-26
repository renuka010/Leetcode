class Solution {
    public int climbStairs(int n) {
        int step0=1, step1=1, i=2;
        while(i<=n){
            int temp= step0+step1;
            step0=step1;
            step1=temp;
            i++;
        }
        return step1;
    }
}