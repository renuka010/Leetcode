class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        String[] words=s.split(" ",0);
        for(int i=0; i<words.length; i++){
            StringBuilder s2=new StringBuilder(words[i]);
            s2.reverse();
            s1.append(s2+" ");
        }
        s1.deleteCharAt(s1.length()-1);
        return s1.toString();
    }
}