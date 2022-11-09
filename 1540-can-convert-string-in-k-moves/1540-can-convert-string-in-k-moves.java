class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(k==0)
            return s.equals(t);
        if(s.length()!=t.length())
            return false;
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0; i<s.length(); i++){
            int c1=s.charAt(i)-'a'+1;
            int c2=t.charAt(i)-'a'+1;
            if(c1==c2)
                continue;
            int x=(c1<c2)? c2-c1: 26-c1+c2;
            map.put(x,map.getOrDefault(x,0)+1);
            x+=(map.get(x)-1)*26;
            if(x>k)
                return false;
        }
        return true;
    }
}