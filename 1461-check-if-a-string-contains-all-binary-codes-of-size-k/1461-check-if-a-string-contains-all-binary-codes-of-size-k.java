class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set=new HashSet<>();
        if(1<<k-1 >s.length())
            return false;
        
        for(int i=0; i<=s.length()-k; i++){
            set.add(s.substring(i,i+k));
        }
        return set.size()==1<<k;
    }
}