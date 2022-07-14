class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddsum=0, evensum=0;
        for(int i:position){
            if(i%2==0)
                evensum+=1;
            else
                oddsum+=1;
        }
        return Math.min(evensum,oddsum);
    }
}