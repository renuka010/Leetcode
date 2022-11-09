class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res=new StringBuilder(s);
        int i=0, open=0;;
        Deque<Integer> q=new ArrayDeque<>();
        
        while(i<res.length()){
            if(res.charAt(i)==')'){
                if(open>0){
                    open--;
                    q.poll();
                    i++;
                }
                else
                    res.delete(i,i+1);   
            }
            else if(res.charAt(i)=='('){
                open++;
                q.offer(i);
                i++;
            }
            else
                i++;
        }
        while(!q.isEmpty()){
            int x=q.pollLast();
            res.delete(x,x+1);
        }
        return res.toString();
    }
}