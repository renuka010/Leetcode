class StockSpanner {
    Stack<Integer> s;
    List<Integer> num;
    
    public StockSpanner() {
        this.s=new Stack<>();
        this.num=new ArrayList<>();
    }
    
    public int next(int price) {
        num.add(price);
        while(!s.isEmpty() && num.get(s.peek())<=price){
            s.pop();
        }
        int l=num.size()-1, res;
        if(!s.isEmpty())
            res=l-s.peek();
        else
            res=l+1;
        s.push(l);
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */