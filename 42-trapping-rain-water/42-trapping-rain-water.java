class Solution {
    public int trap(int[] h) {
        int[] minmax=new int[h.length];
        int max=0, sum=0;
        for(int i=0; i<h.length; i++){
            minmax[i]=max;
            if(h[i]>max)
                max=h[i];
        }
        max=0;
        for(int i=h.length-1; i>=0; i--){
            minmax[i]=Math.min(minmax[i],max)-h[i];
            if(h[i]>max)
                max=h[i];
            if(minmax[i]>0)
                sum+=minmax[i];
        }
        return sum;
    }
}