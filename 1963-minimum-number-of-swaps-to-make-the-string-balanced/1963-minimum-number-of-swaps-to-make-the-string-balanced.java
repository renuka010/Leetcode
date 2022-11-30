class Solution {
    public int minSwaps(String s) {
        int badops=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='[')
                badops++;
            else if(badops!=0)
                badops--;
        }
        return (badops+1)/2;
    }
}