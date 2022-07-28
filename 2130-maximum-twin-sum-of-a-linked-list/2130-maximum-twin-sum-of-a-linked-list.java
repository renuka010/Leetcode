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
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        int max=head.val;
        while(fast!=null){
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            int sum=slow.val+s.pop();
            if(sum>max)
                max=sum;
            slow=slow.next;
        }
        return max;
    }
}