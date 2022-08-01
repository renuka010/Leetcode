class Solution {
    public String removeDuplicateLetters(String s) {
        int[] map=new int[26];
        int i;
        boolean visited[]=new boolean[26];
        for(i=0; i<s.length(); i++)
            map[s.charAt(i)-'a']++;
        StringBuilder res=new StringBuilder();
        i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            int x=c-'a';
            int l=res.length()-1;
            if(!visited[x]){
                while(l>=0 && res.charAt(l)>c && map[res.charAt(l)-'a']!=0){
                    visited[res.charAt(l)-'a']=false;
                    res.deleteCharAt(l);
                    l--;
                }
                res.append(c);
                map[x]--;
                visited[x]=true;
            }
            else
                map[x]--;
            i++;
        }
        return res.toString();
    }
}