class Solution {
    public int minSwaps(String s) {
        int lo=0,lc=0,ro=0,rc=0;
        int l=0, r=s.length()-1, swap=0;
        while(l<r){
            if(s.charAt(l)=='[')
                lo++;
            else
                lc++;
            if(s.charAt(r)=='[')
                ro++;
            else
                rc++;
            if(lo<lc && ro>rc){
                swap++;
                lc--;
                lo++;
                ro--;
                rc++;
                l++;
                r--;
                continue;
            }
            if(lo<lc){
                lc--;
            }
            else
                l++;
            if(ro>rc){
                ro--;
            }
            else
                r--;
        }
        return swap;
    }
}