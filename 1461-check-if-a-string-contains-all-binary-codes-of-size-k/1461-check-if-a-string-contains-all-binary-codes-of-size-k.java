class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set=new HashSet<>();
        if(1<<k-1 >s.length())
            return false;
        StringBuilder s1=new StringBuilder(s.substring(0,k));
        set.add(s1.toString());
        for(int i=k; i<s.length(); i++){
            s1.deleteCharAt(0);
            s1.append(s.charAt(i));
            set.add(s1.toString());
        }
        return set.size()==1<<k;
    }
}