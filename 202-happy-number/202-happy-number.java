class Solution {
    public boolean isHappy(int n) {
        ListNode head=new ListNode(n);
        while(n!=1){
            int sum=0;
            while(n!=0){
                int digit=n%10;
                n=n/10;
                sum+=digit*digit;
            }
            n=sum;
            ListNode curr=head;
            while(curr!=null && curr.next!=null){
                if(curr.next.val==n)
                    return false;
                else
                    curr=curr.next;
            }
            curr.next=new ListNode(n);
        }
        return (n==1);
    }
}