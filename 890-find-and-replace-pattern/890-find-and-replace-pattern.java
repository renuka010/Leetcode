class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<>();
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        int l=pattern.length();
        for(String word:words){
            map1.clear();
            map2.clear();
            int i=0;
            while(i<l){
                char w=word.charAt(i), p=pattern.charAt(i);
                map1.putIfAbsent(w,p);
                map2.putIfAbsent(p,w);
                if(map1.get(w)!=p || map2.get(p)!=w)
                    break;
                i++;
            }
            if(i==l)
                res.add(word);
        }
        return res;
    }
}