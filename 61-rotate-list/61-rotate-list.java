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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast=new ListNode();
        if(head==null)
            return head;
        if(k==0)
            return head;
        fast.next=head;
        ListNode slow=fast;
        int count=0, n=k;
        while(slow.next!=null && n!=0){
            slow=slow.next;
            n--;
            count++;
        }
        if(slow.next==null && n==0)
            return head;
        if(count!=k){
            n=k%count;
            if(n==0)
                return head;
            slow=fast;
            while(n!=0){
                slow=slow.next;
                n--;
            }
        }
        while(slow.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode newHead=fast.next;
        slow.next=head;
        fast.next=null;
        return newHead;
    }
}