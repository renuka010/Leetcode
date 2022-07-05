/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr=head;
        int n=10000;
        while(n>0 && curr!=null && curr.next!=null){
            curr=curr.next;
            n--;
        }
        return !(n>0);
    }
}