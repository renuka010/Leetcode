class Solution {
    public boolean validPalindrome(String s) {
        return check(s,0,s.length()-1,true);
    }
    public boolean check(String s,int left, int right, boolean b){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right) && b==true){
                return check(s,left,right-1,false) || check(s,left+1,right,false);
            }
            else if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}