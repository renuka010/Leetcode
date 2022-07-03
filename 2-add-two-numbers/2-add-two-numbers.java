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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=l1;
        int carry=0;
        while(l1!=null && l2!=null){
            int prev=carry;
            carry=(l1.val+l2.val+carry)/10;
            l1.val=(l1.val+l2.val+prev)%10;
            if(l1.next==null){
                if(l2.next==null && carry!=0){
                    l1.next=new ListNode(carry);
                    return head;
                }
                l1.next=l2.next;
                l1=l1.next;
                l2=null;
                break;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int prev=carry;
            carry=(l1.val+carry)/10;
            l1.val=(l1.val+prev)%10;
            if(l1.next==null)
                break;
            l1=l1.next;
        }
        if(carry!=0)
            l1.next=new ListNode(carry);
        return head;
    }
}