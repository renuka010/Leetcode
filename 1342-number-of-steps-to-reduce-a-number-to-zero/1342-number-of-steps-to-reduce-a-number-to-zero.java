class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if((num&1)==0)
                step++;
            else
                step+=2;
            num>>=1;
        }
        return (step==0)?step:step-1;
    }
}