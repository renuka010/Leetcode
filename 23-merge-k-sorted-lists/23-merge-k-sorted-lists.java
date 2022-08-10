/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Stack<ListNode> s=new Stack<>();
        ArrayDeque<ListNode> dq=new ArrayDeque<>();
        for(int i=0; i<lists.length; i++){
            ListNode head=lists[i];
            while(head!=null){
                while(!dq.isEmpty() && dq.peekLast().val>head.val){
                    s.push(dq.pollLast());
                }
                while(!s.isEmpty() && s.peek().val<head.val){
                    dq.offer(s.pop());
                }
                dq.offer(head);
                head=head.next;
            }
        }
        while(!s.isEmpty()){
            dq.offer(s.pop());
        }
        
        ListNode head=new ListNode();
        ListNode curr=head;
        while(!dq.isEmpty()){
            curr.next=dq.poll();
            curr=curr.next;
        }
        return head.next;
    }
}