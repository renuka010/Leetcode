class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        Set<String> set=new HashSet<>(Arrays.asList("+","-","*","/"));
        for(String t:tokens){
            if(set.contains(t)){
                int b=s.pop(), a=s.pop();
                if(t.equals("+"))
                    s.push(a+b);
                else if(t.equals("-"))
                    s.push(a-b);
                else if(t.equals("*"))
                    s.push(a*b);
                else
                    s.push(a/b);
            }
            else
                s.push(Integer.parseInt(t));
        }
        return (int)s.pop();
    }
}