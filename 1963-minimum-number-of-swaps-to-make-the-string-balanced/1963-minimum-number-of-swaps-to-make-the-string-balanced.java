class Solution {
    public int minSwaps(String s) {
        int l=0, r=s.length()-1;
        int lcount=0, rcount=0, swap=0;
        while(l<r){
            while(lcount!=-1 && l<r){
                if(s.charAt(l)==']')
                    lcount--;
                else
                    lcount++;
                if(lcount!=-1)
                    l++;
            }
            while(rcount!=-1 && l<r){
                if(s.charAt(r)=='[')
                    rcount--;
                else
                    rcount++;
                if(rcount!=-1)
                    r--;
            }
            if(l<r){
                rcount=1;
                lcount=1;
                swap++;
                l++;
                r--;
            }
        }
        return swap;
    }
}