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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=new ListNode();
        curr.next=list1;
        int i=0;
        while(i!=a){
            curr=curr.next;
            i++;
        }
        ListNode curr2=curr.next;;
        while(i!=b){
            curr2=curr2.next;
            i++;
        }
        curr.next=list2;
        while(list2.next!=null)
            list2=list2.next;
        list2.next=curr2.next;
        return list1;
    }
}