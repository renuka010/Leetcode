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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=new ListNode(), prev, next=new ListNode(), last=new ListNode();
        ListNode curr=head;
        last.next=head;
        boolean flag=false;
        while(curr!=null && last.next!=null){
            int i=0;
            while(i<k && last.next!=null){
                last=last.next;
                i++;
            }
            if(i!=k)
                break;
            prev=last.next;
            
            while(prev!=last){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            temp.next=prev;
            if(flag==false){
                flag=true;
                head=last;
            }
            i=1;
            while(i<k){
                last=last.next;
                i++;
            }
            
            temp=last;
        }
        return head;
    }
}