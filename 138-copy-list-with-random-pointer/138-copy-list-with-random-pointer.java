/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map= new HashMap<>();
        if(head==null)
            return null;
        
        Node curr=head;
        while(curr!=null){
            Node newnode=new Node(curr.val);
            map.put(curr,newnode);
            curr=curr.next;
        }
        
        curr=map.get(head);
        Node newHead=curr;
        while(head!=null){
            if(head.next!=null)
                curr.next=map.get(head.next);
            else
                curr.next=null;
            if(head.random!=null)
                curr.random=map.get(head.random);
            else
                curr.random=null;
            head=head.next;
            curr=curr.next;
        }
        return newHead;
    }
}





