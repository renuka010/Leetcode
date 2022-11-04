class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        helper(new StringBuilder(s), 0, res, new ArrayList<String>());
        return res;
    }
    public void helper(StringBuilder s, int start, List<List<String>> res, List<String> part){
        if(start==s.length()){
            res.add(new ArrayList<String>(part));
            return;
        }
        for(int i=1; i+start<=s.length(); i++){
            if(isPalindrome(s,start,i+start)){
                part.add(s.substring(start,start+i));
                helper(s,start+i,res,part);
                part.remove(part.size()-1);
            }
        }
    }
    public boolean isPalindrome(StringBuilder s, int start, int i){
        int l=start, r=i-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}