class MinStack {
    
    private class stknode{
        private int min;
        private int val;
        private stknode next;
        
    }
    
    stknode top=new stknode();
    stknode minTop=new stknode();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stknode s=new stknode();
        s.val=val;
        s.next=top;
        if(top.next==null)
            s.min=val;
        else
            s.min=Math.min(val,s.next.min);
        top=s;
    }
    
    public void pop() {
            top=top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */