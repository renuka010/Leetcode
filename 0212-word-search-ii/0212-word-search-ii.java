class Trie{
    
    Trie[] next=new Trie[26];
    String end;
    
    Trie() {}
    
    public void add(int i,String s){
        char c=s.charAt(i);
        if(next[c-'a']==null)
            next[c-'a']=new Trie();
        i++;
        if(i==s.length())
            next[c-'a'].end=s;
        else
            next[c-'a'].add(i,s);
    }
    
}

class Solution {
    
    public List<String> findWords(char[][] board, String[] words) {
        Trie t=new Trie();
        
        for(String s:words)
            t.add(0,s);
        
        Set<String> set=new HashSet<>();
        boolean visit[][]=new boolean [board.length][board[0].length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                check(t,i,j,board,visit,set);
            }
        }
        
        List<String> res=new ArrayList<String>();
        res.addAll(set);
        return res;
    }
    
    public void check(Trie t,int i, int j, char[][] board, boolean[][] visited, Set<String> set){
        
        if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]||t.next[board[i][j]-'a']==null)
            return;
        
        visited[i][j]=true;
        t=t.next[board[i][j]-'a'];
        if(t.end!=null)
            set.add(t.end);
        
        check(t,i+1,j,board,visited,set);
        check(t,i,j+1,board,visited,set);
        check(t,i-1,j,board,visited,set);
        check(t,i,j-1,board,visited,set);
        
        visited[i][j]=false;
    }
}