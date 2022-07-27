/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        Stack<Node> s=new Stack<>();
        while(curr!=null){
            if(curr.child!=null){
                if(curr.next!=null)
                    s.push(curr.next);
                curr.next=curr.child;
                curr.next.prev=curr;
                curr.child=null;
            }
            else if(curr.next==null && !s.isEmpty()){
                curr.next=s.pop();
                curr.next.prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}