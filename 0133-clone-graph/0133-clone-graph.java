/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        if(node==null)
            return null;
        q.offer(node);
        Node newNode=new Node(node.val);
        map.put(node,newNode);
        node=newNode;
        while(!q.isEmpty()){
            Node curr=q.poll();
            newNode=map.get(curr);
            List<Node> list=curr.neighbors;
            for(int i=0; i<list.size(); i++){
                Node neighbour=map.getOrDefault(list.get(i),new Node(list.get(i).val));
                newNode.neighbors.add(neighbour);
                if(!map.containsKey(list.get(i))){
                    map.put(list.get(i),neighbour);
                    q.offer(list.get(i));
                }
            }
        }
        return node;
    }
}