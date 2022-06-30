class MyQueue {
    Stack<Integer> q1=new Stack<>();
    Stack<Integer> q2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
        q1.push(x);
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
    }
    
    public int pop() {
        return q1.pop();
    }
    
    public int peek() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */