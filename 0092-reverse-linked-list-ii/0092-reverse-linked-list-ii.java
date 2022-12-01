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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead=new ListNode();
        newHead.next=head;
        ListNode curr=newHead;
        ListNode slow=newHead, fast=newHead;
        while(left>1){
            left--;
            slow=slow.next;
            right--;
            fast=fast.next;
        }
        while(right>0){
            right--;
            fast=fast.next;
        }
        curr=slow.next;
        slow.next=fast;
        ListNode prev=fast.next, next;
        fast=fast.next;
        
        while(curr!=null && curr!=fast){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return newHead.next;
    }
}