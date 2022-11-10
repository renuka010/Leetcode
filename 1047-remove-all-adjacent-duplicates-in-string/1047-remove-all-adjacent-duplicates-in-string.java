class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(res.length()!=0 && s.charAt(i)==res.charAt(res.length()-1))
                res.delete(res.length()-1,res.length());
            else
                res.append(s.charAt(i));
        }
        return res.toString();
    }
}