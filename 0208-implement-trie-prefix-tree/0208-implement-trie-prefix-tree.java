class Node{
    int val;
    Node[] map=new Node[26];
    boolean end=false;
    
    public Node(){
        
    }
    
    public Node(int val){
        this.val=val;
    }
    
    public boolean containsKey(int key){
        if(map[key]!=null)
            return true;
        return false;
    }
    
    public Node get(int key){
        return map[key];
    }
    
    public void putNode(Node curr,Node n){
        curr.map[n.val]=n;
    }
    
}
class Trie {

    Node root;
    
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int key=word.charAt(i)-'a';
            if(curr.containsKey(key)){
                Node node=curr.get(key);
                curr=node;
            }
            else{
                Node node=new Node(key);
                curr.putNode(curr,node);
                curr=node;
            }
        }
        curr.end=true;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int key=word.charAt(i)-'a';
            if(curr.containsKey(key)){
                Node node=curr.get(key);
                curr=node;
            }
            else
                return false;
        }
        return curr.end==true;
    }
    
    public boolean startsWith(String word) {
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int key=word.charAt(i)-'a';
            if(curr.containsKey(key)){
                Node node=curr.get(key);
                curr=node;
            }
            else
                return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */