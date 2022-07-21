/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        Iterator<Node> i= root.children.iterator();
        res.add(root.val);
        while(i.hasNext()){
            res.addAll(preorder(i.next()));
        }
        return res;
    }
}