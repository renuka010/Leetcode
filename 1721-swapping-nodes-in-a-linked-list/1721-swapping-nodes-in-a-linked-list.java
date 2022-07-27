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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a=new ListNode(),b=new ListNode(),c=new ListNode();
        a.next=head;
        b.next=head;
        c.next=head;
        int i=0;
        while(i<k){
            a=a.next;
            b=b.next;
            i++;
        }
        while(b!=null){
            b=b.next;
            c=c.next;
        }
        int temp=a.val;
        a.val=c.val;
        c.val=temp;
        return head;
    }
}