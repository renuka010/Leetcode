class Solution {
    public String getHint(String s, String g) {
        int hit=0, miss=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==g.charAt(i))
                hit++;
            else
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=g.charAt(i)){
                int x=map.getOrDefault(g.charAt(i),-1);
                if(x>0){
                    map.put(g.charAt(i),x-1);
                    miss++;
                }
            }
        }
        return hit+"A"+miss+"B";
    }
}