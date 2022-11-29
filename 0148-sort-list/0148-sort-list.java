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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode mid=getMid(head);
        ListNode next=mid.next;
        mid.next=null;
        head=sortList(head);
        next=sortList(next);
        return mergeList(head,next);
    }
    public ListNode mergeList(ListNode head1, ListNode head2){
        ListNode head=new ListNode();
        ListNode curr=head;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                curr.next=head1;
                head1=head1.next;
            }
            else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
            curr.next=null;
        }
        if(head1!=null)
            curr.next=head1;
        if(head2!=null)
            curr.next=head2;
        return head.next;
    }
    public ListNode getMid(ListNode head){
        ListNode slow=new ListNode();
        slow.next=head;
        ListNode fast=slow;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}