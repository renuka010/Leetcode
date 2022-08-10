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
        Queue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            while(head!=null){
                q.offer(head);
                head=head.next;
            }
        }
        if(q.isEmpty())
            return null;
        ListNode l=q.poll();
        ListNode head=l;
        while(!q.isEmpty()){
            l.next=q.poll();
            l=l.next;
        }
        l.next=null;
        return head;
    }
}