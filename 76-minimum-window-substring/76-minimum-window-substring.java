class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tmap=new HashMap<>();
        Map<Character,Integer> smap=new HashMap<>();
        int slen=s.length(), matches=t.length(), match=0,j=0, start=-1, end=slen+1, length=0;
        for(char c:t.toCharArray())
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        
        for(int i=0; i<slen; i++){
            char x=s.charAt(i);
            if(!tmap.containsKey(x))
                continue;
            if(j==0)
                j=i;
            while(j<slen && matches!=match){
                char c=s.charAt(j);
                if(!tmap.containsKey(c)){
                    j++;
                    continue;
                }
                smap.put(c,smap.getOrDefault(c,0)+1);
                if(smap.get(c)<=tmap.get(c))
                    match++;
                j++;
            }
            if(matches==match && j-i<end-start){
                start=i;
                end=j;
            }
            if(smap.get(x)<=tmap.get(x))
                match--;
            smap.put(x,smap.get(x)-1);
        }
        if(start==-1)
            return "";
        return s.substring(start,end);
    }
}