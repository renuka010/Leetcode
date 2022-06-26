class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0, i, j;
        
        for(i=0;i<k;i++)
            sum+=cardPoints[i];
        int max=sum;
        i=k-1;
        j=cardPoints.length-1;
        
        while(k--!=0){
            sum=sum-cardPoints[i--]+cardPoints[j--];
            if (sum>max)
                max=sum;
            if (i==-1)
                i=cardPoints.length;
        }
        return max;
    }
}