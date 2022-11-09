class Trie{
    char val;
    boolean end=false;
    Trie[] children=new Trie[26];
    
}
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie root=new Trie();
        Trie curr;
        
        for(String s:dictionary){
            int i=0;
            curr=root;
            while(i<s.length()){
                char c=s.charAt(i);
                if(curr.children[c-'a']==null)
                    curr.children[c-'a']=new Trie();
                curr=curr.children[c-'a'];
                curr.val=c;
                i++;
            }
            curr.end=true;
        }
        
        String[] sen=sentence.split(" ");
        for(int i=0; i<sen.length; i++){
            curr=root;
            int j=0;
            while(j<sen[i].length()){
                char c=sen[i].charAt(j);
                if(curr.children[c-'a']!=null && curr.children[c-'a'].val==c){
                    curr=curr.children[c-'a'];
                    if(curr.end){
                        sen[i]=sen[i].substring(0,j+1);
                        break;
                    }
                }
                else
                    break;
                j++;
            }
        }
        StringBuilder res=new StringBuilder();
        for(String s:sen){
            res.append(s+' ');
        }
        return res.toString().trim();
    }
}