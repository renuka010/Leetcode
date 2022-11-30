class Solution {
    public int strStr(String h, String n) {
        int i=0, j=0;
        while(i<h.length() && j<n.length()){
            if(h.charAt(i)==n.charAt(j)){
                j++;
            }
            else{
                i-=j;
                j=0;
            }
            i++;
        }
        if(j==n.length())
            return i-n.length();
        return -1;
    }
}