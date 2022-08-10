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
    public void reorderList(ListNode head) {
        ListNode curr=new ListNode();
        ListNode fast=new ListNode();
        curr.next=head;
        fast.next=head;
        while(fast!=null && fast.next!=null){
            curr=curr.next;
            fast=fast.next.next;
        }
        ListNode prev=curr;
        curr=curr.next;
        prev.next=null;
        prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        curr=prev;
        fast=new ListNode();
        while(head!=null && curr!=null){
            fast.next=head;
            head=head.next;
            fast=fast.next;
            fast.next=curr;
            curr=curr.next;
            fast=fast.next;
        }
        if(head!=null){
            fast.next=head;
        }
    }
}