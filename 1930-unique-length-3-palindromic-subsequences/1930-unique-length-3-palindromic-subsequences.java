class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        Set<Integer> left=new HashSet<>();
        int[] right=new int[26];
        left.add(s.charAt(0)-'a');
        for(int i=2; i<s.length(); i++){
            right[s.charAt(i)-'a']++;
        }
        
        Set<String> set=new HashSet<>();
        for(int i=1; i<s.length()-1; i++){
            for(int j=0; j<26; j++){
                if(right[j]!=0 && left.contains(j))
                    set.add(s.charAt(i)+Integer.toString(j));
            }
            left.add(s.charAt(i)-'a');
            right[s.charAt(i+1)-'a']--;
        }
        return set.size();
    }
}