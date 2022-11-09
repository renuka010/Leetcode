class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res=new StringBuilder(s);
        int i=0, open=0;;
        Stack<Integer> stk=new Stack<>();
        
        while(i<res.length()){
            if(res.charAt(i)==')'){
                if(open>0){
                    open--;
                    i++;
                }
                else
                    res.delete(i,i+1);   
            }
            else if(res.charAt(i)=='('){
                open++;
                stk.push(i);
                i++;
            }
            else
                i++;
        }
        while(open>0){
            int x=stk.pop();
            res.delete(x,x+1);
            open--;
        }
        return res.toString();
    }
}