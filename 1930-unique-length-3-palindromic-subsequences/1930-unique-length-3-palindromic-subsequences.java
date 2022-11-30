class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        int[][] left=new int[n][26];
        int[][] right=new int[n][26];
        Set<String> set=new HashSet<>();
        left[0][s.charAt(0)-'a']++;
        for(int i=1; i<n; i++){
            left[i][s.charAt(i)-'a']++;
            for(int j=0; j<26; j++){
                left[i][j]+=left[i-1][j];
            }
        }
        right[n-1][s.charAt(n-1)-'a']++;
        for(int i=n-2; i>=0; i--){
            right[i][s.charAt(i)-'a']++;
            for(int j=0; j<26; j++){
                right[i][j]+=right[i+1][j];
            }
        }
        for(int i=1; i<n-1; i++){
            for(int j=0; j<26; j++){
                if(left[i-1][j]!=0 && right[i+1][j]!=0){
                    String s1=Integer.toString(j)+s.charAt(i);
                    set.add(s1);
                }
            }
        }
        return set.size();
    }
}