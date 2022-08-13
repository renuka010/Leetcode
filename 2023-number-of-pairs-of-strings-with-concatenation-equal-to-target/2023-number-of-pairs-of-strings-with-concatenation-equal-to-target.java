class Solution {
    String t;
    public int numOfPairs(String[] nums, String target) {
        HashMap<String,Integer> map=new HashMap<>();
        t=target;
        int count=0, i;
        for(String x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(String s:nums){
            String x=otherHalf(s);
            if(map.containsKey(x)){
                i=map.get(x);
                if(x.equals(s))
                    i--;
                count+=i;
            }
        }
        return count;
    }
    public String otherHalf(String s){
        int i=0, tl=t.length(), sl=s.length();
        if(tl<=sl)
            return "";
        while(i<sl){
            if(t.charAt(i)!=s.charAt(i))
                return "";
            i++;
        }
        return t.substring(i,tl);
    }
}