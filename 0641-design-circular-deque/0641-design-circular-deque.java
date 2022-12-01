class Dq{
    int val;
    Dq next, prev;
    Dq(){}
    Dq(int value){
        val=value;
    }
}
class MyCircularDeque {
    int max, size;
    Dq start,end;

    public MyCircularDeque(int k) {
        max=k;
        size=0;
        start=new Dq();
        end=new Dq();
        start.next=end;
        end.prev=start;
    }
    
    public boolean insertFront(int value) {
        if(size==max)
            return false;
        Dq temp=new Dq(value);
        end.prev.next=temp;
        temp.prev=end.prev;
        temp.next=end;
        end.prev=temp;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size==max)
            return false;
        Dq temp=new Dq(value);
        temp.next=start.next;
        temp.next.prev=temp;
        start.next=temp;
        temp.prev=start;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0)
            return false;
        end=end.prev;
        end.next=null;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size==0)
            return false;
        start=start.next;
        start.prev=null;
        size--;
        return true;
    }
    
    public int getFront() {
        if(size==0)
            return -1;
        return end.prev.val;
    }
    
    public int getRear() {
        if(size==0)
            return -1;
        return start.next.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==max;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */