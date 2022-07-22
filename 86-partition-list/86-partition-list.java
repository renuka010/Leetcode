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
    public ListNode partition(ListNode head, int x) {
        ListNode prev=new ListNode();
        prev.next=head;
        ListNode curr=new ListNode();
        curr.next=head;
        head=prev;
        while(curr.next!=null && curr.next.val<x){
            curr=curr.next;
            prev=prev.next;
        }
        while(curr.next!=null){
            if(curr.next.val<x){
                ListNode next=prev.next;
                prev.next=curr.next;
                curr.next=curr.next.next;
                prev.next.next=next;
                prev=prev.next;
            }
            else
                curr=curr.next;
        }
        return head.next;
    }
}