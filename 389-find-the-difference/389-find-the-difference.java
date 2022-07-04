class Solution {
    public char findTheDifference(String s, String t) {
        int[] map=new int[26];
        int i;
        for(i=0; i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        map[t.charAt(i)-'a']--;
        for(i=0; i<26; i++){
            if(map[i]==-1)
                return (char)(i+'a');
        }
        return ' ';
    }
}