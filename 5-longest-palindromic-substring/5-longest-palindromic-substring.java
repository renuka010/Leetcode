class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)
            return s;
        StringBuilder res=new StringBuilder();
        for(int i=1; i<s.length(); i++){
            int l=i-1, r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(res.length()<s.substring(l+1,r).length())
                res.replace(0,res.length(),s.substring(l+1,r));
            
            l=i-1;
            r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(res.length()<s.substring(l+1,r).length())
                res.replace(0,res.length(),s.substring(l+1,r));
        }
        return res.toString();
    }
}