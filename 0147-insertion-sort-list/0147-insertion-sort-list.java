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
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead=new ListNode();
        ListNode curr;
        while(head!=null){
            curr=newHead;
            ListNode prev=curr;
            while(curr.next!=null && curr.next.val<head.val){
                curr=curr.next;
            }
            ListNode next=curr.next;
            curr.next=head;
            head=head.next;
            curr.next.next=next;
        }
        return newHead.next;
    }
}