class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> r=new ArrayList<>();
        for(int i=0; i<=s.length()-p.length(); i++){
            if(isAna(s,p,i)){
                r.add(i);
                while(i<s.length()-p.length() && s.charAt(i)==s.charAt(i+p.length())){
                    i++;
                    r.add(i);
                }
            }
        }
        return r;
    }
    public boolean isAna(String s, String p, int index){
        int[] res=new int[26];
        for(int i=index; i<index+p.length(); i++){
            res[s.charAt(i)-'a']++;
            res[p.charAt(i-index)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(res[i]!=0)
                return false;
        }
        return true;
    }
}