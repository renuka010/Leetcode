class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String s: strs){
            char[] w=new char[26];
            for(int i=0; i<s.length(); i++)
                w[s.charAt(i)-'a']++;
            String word=new String(w);
            map.computeIfAbsent(word,k->new ArrayList<>());
            map.get(word).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}