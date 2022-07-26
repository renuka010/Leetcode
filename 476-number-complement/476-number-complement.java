class Solution {
    public int findComplement(int n) {
        int res=0, i=0;
        while(n!=0){
            if((n&1)==0)
                res+=1<<i;
            i++;
            n>>=1;
        }
        return res;
    }
}