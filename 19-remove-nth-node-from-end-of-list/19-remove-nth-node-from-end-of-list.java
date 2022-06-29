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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=1,i;
        ListNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
            count++;
        }
        ptr=head;
        if (n==count)
            return head.next;
        i=count-n;
        while(i>1){
            ptr=ptr.next;
            i--;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}