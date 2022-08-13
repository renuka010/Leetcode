class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int i=0, j=1;
        HashMap<String,Integer> map=new HashMap<>();
        while(i<s1.length()){
            while(j<s1.length() && s1.charAt(j)!=' ')
                j++;
            String s=s1.substring(i,j);
            map.put(s,map.getOrDefault(s,0)+1);
            i=j+1;
            j++;
        }
        i=0; j=1;
        Set<String> set=new HashSet<>();
        while(i<s2.length()){
            while(j<s2.length() && s2.charAt(j)!=' ')
                j++;
            String s=s2.substring(i,j);
            map.put(s,map.getOrDefault(s,0)+1);
            i=j+1;
            j++;
        }
        i=0;
        for(Map.Entry e:map.entrySet()){
            if((int)(e.getValue())==1)
                set.add(e.getKey().toString());
        }
        String[] res=new String[set.size()];
        for(String s:set)
            res[i++]=s.toString();
        return res;
    }
}