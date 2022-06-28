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
    public ListNode middleNode(ListNode head) {
        ListNode fast=new ListNode(head.val,head.next);
        ListNode slow=new ListNode(head.val,head.next);
        while(fast.next!=null && fast.next.next!=null && fast.next.next.next!=null){
            slow.val=slow.next.val;
            slow.next=slow.next.next;
            fast.val=fast.next.next.val;
            fast.next=fast.next.next.next;
        }
        if(slow.next!=null)
            return slow.next;
        else 
            return slow;
    }
}