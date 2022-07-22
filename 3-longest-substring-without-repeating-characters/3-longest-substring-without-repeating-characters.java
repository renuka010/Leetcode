class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=1, l=0, start=0;
        if(s.length()==0)
            return 0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            while(!set.add(c)){
                set.remove(s.charAt(start));
                start++;
                l--;
            }
            l++;
            maxLen=Math.max(l,maxLen);
        }
        return maxLen;
    }
}