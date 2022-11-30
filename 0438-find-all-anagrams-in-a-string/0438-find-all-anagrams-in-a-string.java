class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] map=new int[26];
        for(int i=0; i<p.length(); i++){
            map[p.charAt(i)-'a']++;
        }
        
        int len=p.length();
        int win=0, j=0, i=0;
        int[] smap=new int[26];
        
        while(i<s.length()){
            if(map[s.charAt(i)-'a']==0){
                Arrays.fill(smap,0);
                i++;
                j=i;
                win=0;
                continue;
            }
            
            while(smap[s.charAt(i)-'a']+1>map[s.charAt(i)-'a']){
                win--;
                smap[s.charAt(j)-'a']--;
                j++;
            }
            win++;
            smap[s.charAt(i)-'a']++;
            
            if(win==len){
                smap[s.charAt(j)-'a']--;
                win--;
                res.add(j);
                j++;
            }
            i++;
        }
        return res;
    }
}