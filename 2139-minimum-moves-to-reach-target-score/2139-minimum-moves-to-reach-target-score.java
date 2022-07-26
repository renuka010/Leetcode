class Solution {
    public int minMoves(int target, int maxD) {
        int step=0;
        while(maxD!=0 && target!=1){
            if(maxD>0 && target%2==0){
                maxD--;
                target/=2;
            }
            else{
                target--;
            }
            step++;
        }
        return step+target-1;
    }
}