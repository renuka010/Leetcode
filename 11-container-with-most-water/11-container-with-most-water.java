class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1,max=0;
        while(l<r){
            int h;
            if(height[l]<height[r]){
                h=(r-l)*height[l];
                l++;
            }
            else{
                h=(r-l)*height[r];
                r--;
            }
            if(h>max)
                max=h;
        }
        return max;
    }
}