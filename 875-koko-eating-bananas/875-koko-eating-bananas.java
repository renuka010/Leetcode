class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1, r=0, res=0;
        for(int i:piles){
            if(i>r)
                r=i;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            int sum=0;
            for(int x:piles){
                sum+=Math.ceil((double)x/mid);
            }
            if(sum>h)
                l=mid+1;
            else{
                res=mid;
                r=mid-1;}
        }
        return res;
    }
}