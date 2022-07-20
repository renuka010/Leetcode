class Solution {
    public int mySqrt(int x) {
        int left=1, right=x, mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(mid>x/mid)
                right=mid-1;
            else{
                left=mid+1;
            }
        }
        return right;
    }
}