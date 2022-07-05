class Solution {
    public boolean isPalindrome(String s) {
        int left=0, right=s.length()-1;
        while(left<right){
            while(left<right && !isAlphaNum(s.charAt(left)))
                left++;
            while(left<right && !isAlphaNum(s.charAt(right)))
                right--;
            
            if(left>=right)
                break;
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        return ('A'<=c && c<='Z') || ('a'<=c && c<='z') || ('0'<=c && c<='9');
    }
}