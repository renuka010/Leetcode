class MyStack {
    public Queue<Integer> q1=new LinkedList<>();
    public Queue<Integer> q2=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int x=0;
        while(!q1.isEmpty()){
            x=q1.poll();
            if(!q1.isEmpty())
                q2.offer(x);
        }
        while(!q2.isEmpty())
            q1.offer(q2.poll());
        return x;
    }
    
    public int top() {
        int x=0;
        while(!q1.isEmpty()){
            x=q1.poll();
            q2.offer(x);
        }
        while(!q2.isEmpty())
            q1.offer(q2.poll());
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */