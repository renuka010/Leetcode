class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        
        for(int i=0; i<strs.length; i++){
            char[] charmap=new char[26];
            for(int j=0; j<strs[i].length(); j++)
                charmap[strs[i].charAt(j)-'a']++;
            String x=new String(charmap);
            map.putIfAbsent(x,new ArrayList<String>());
            (map.get(x)).add(strs[i]);
        }
        
        res.addAll(map.values());
        return res;
    }
}