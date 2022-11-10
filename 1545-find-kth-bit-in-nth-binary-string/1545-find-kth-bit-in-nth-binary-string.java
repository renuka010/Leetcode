class Solution {
    public char findKthBit(int n, int k) {
        int i=1;
        StringBuilder res=new StringBuilder("0");
        while(i!=n){
            int len=res.length();
            if(len>=k+1)
                return (len==k+1)?'1':res.charAt(k-1);
            res.append("1");
            int j=len-1;
            while(j>=0){
                res.append((res.charAt(j)=='0')?'1':'0');
                j--;
            }
            
            i++;
        }
        return res.charAt(k-1);
    }
}