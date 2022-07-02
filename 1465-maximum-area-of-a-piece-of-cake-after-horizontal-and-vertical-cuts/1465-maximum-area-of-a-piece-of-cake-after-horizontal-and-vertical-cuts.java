class Solution {
    public int maxArea(int h, int w, int[] hcuts, int[] vcuts) {
        Arrays.sort(hcuts);
        Arrays.sort(vcuts);
        int hmaxdiff=hcuts[0];
        int vmaxdiff=vcuts[0];
        int i;
        for(i=1; i<hcuts.length; i++){
            hmaxdiff=Math.max(hcuts[i]-hcuts[i-1],hmaxdiff);
        }
        hmaxdiff=Math.max(h-hcuts[i-1],hmaxdiff);
        for(i=1; i<vcuts.length; i++){
            vmaxdiff=Math.max(vcuts[i]-vcuts[i-1],vmaxdiff);
        }
        vmaxdiff=Math.max(w-vcuts[i-1],vmaxdiff);
        return (int)(1L*hmaxdiff*vmaxdiff%1000000007);
    }
}