class Trie{
    char val;
    Trie[] next=new Trie[26];
    boolean end=false;
    
    Trie(){}
    
    Trie(char c){
        val=c;
    }
    
    
}
class WordDictionary {
    
    Trie t;

    public WordDictionary() {
        t=new Trie();
    }
    
    public void addWord(String word) {
        int i=0;
        Trie curr=t;
        while(i<word.length()){
            int c=word.charAt(i)-'a';
            if(curr.next[c]==null){
                curr.next[c]=new Trie(word.charAt(i));
            }
            curr=curr.next[c];
            i++;
        }
        curr.end=true;
    }
    
    public boolean search(String word) {
        int i=0;
        return searchword(word,0,t);
    }
    
    public boolean searchword(String word, int i, Trie t){
        if(i==word.length())
            return t.end;
        int x=word.charAt(i)-'a';
        if(word.charAt(i)=='.'){
            boolean flag=false;
            for(int j=0; j<26; j++){
                if(t.next[j]!=null)
                    flag=searchword(word, i+1, t.next[j]);
                if(flag){
                    return true;
                }
            }
        }
        else{
            t=t.next[x];
            if(t==null)
                return false;
            return searchword(word, i+1, t);
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */