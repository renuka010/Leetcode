class Solution {
    public int maxDistance(int[] colors) {
        int l=0, n=colors.length, r=n-1, res=0;
        while(l<n-1 && r>0){
            if(colors[0]!=colors[r]){
                res=r;
                break;
            }
            if(colors[n-1]!=colors[l]){
                res=n-1-l;
                break;
            }
            r--;
            l++;
        }
        return res;
    }
}