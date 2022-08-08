class Solution {
    public int countCollisions(String d) {
        int len=d.length(), l=0, r=len-1, count=0;
        while(l<len && d.charAt(l)=='L')
            l++;
        while(r>=0 && d.charAt(r)=='R')
            r--;
        while(l<=r){
            if(d.charAt(l)!='S')
                count++;
            l++;
        }
        return count;
    }
}