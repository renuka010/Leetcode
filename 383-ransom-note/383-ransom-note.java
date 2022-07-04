class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[26];
        int i;
        for(i=0; i<magazine.length(); i++)
            a[magazine.charAt(i)-'a']++;
            
        for(i=0; i<ransomNote.length(); i++)
            a[ransomNote.charAt(i)-'a']--;
        
        for(i=0; i<26; i++){
            if (a[i]<0)
                return false;
        }
        return true;
    }
}