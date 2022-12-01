class MyCircularQueue {
    int size;
    int max;
    ListNode start,end;
    int val;

    public MyCircularQueue(int k) {
        max=k;
        size=0;
        start=new ListNode();
        end=start;
    }
    
    public boolean enQueue(int value) {
        if(size==max)
            return false;
        ListNode temp=new ListNode(value);
        end.next=temp;
        end=end.next;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)
            return false;
        start=start.next;
        size--;
        return true;
    }
    
    public int Front() {
        if(size==0)
            return -1;
        return start.next.val;
    }
    
    public int Rear() {
        if(size==0)
            return -1;
        return end.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==max;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */