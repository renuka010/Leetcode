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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null) fast=fast.next;
        fast = reverse(slow);
        
        ListNode prev=null, curr;
        while(head!=null){
            if(head.val!=fast.val)
                return false;
            head=head.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null, nxt=head;
        while(head!=null){
            nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}