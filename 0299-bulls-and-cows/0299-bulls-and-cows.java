class Solution {
    public String getHint(String s, String g) {
        int hit=0, miss=0;
        int[] map=new int[10];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==g.charAt(i))
                hit++;
            map[s.charAt(i)-'0']++;
            map[g.charAt(i)-'0']--;
        }
        miss=g.length()-hit;
        for(int i=0; i<10; i++){
            if(map[i]>0)
                miss-=map[i];
        }
        
        return hit+"A"+miss+"B";
    }
}