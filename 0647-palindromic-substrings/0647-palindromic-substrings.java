class Solution {
    public int countSubstrings(String s) {
        int l,r,res=0;
        for(int i=0; i<s.length(); i++){
            l=i;
            r=i;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r))
                    break;
                res++;
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r))
                    break;
                res++;
                l--;
                r++;
            }
        }
        return res;
    }
}