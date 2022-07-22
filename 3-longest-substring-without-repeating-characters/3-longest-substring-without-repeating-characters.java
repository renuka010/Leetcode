class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=1, r=0;
        if(s.length()==0)
            return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                r=Math.max(r,map.get(c)+1);
            }
            map.put(c,i);
            maxLen=Math.max(i-r+1,maxLen);
        }
        return maxLen;
    }
}