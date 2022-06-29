class Solution {
    public int maxDepth(String s) {
        int depth=0,top=0;
        char[] stack=new char[s.length()/2];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(')
                stack[top++]='(';
            else if(s.charAt(i)==')')
                top--;
            depth=Math.max(depth,top);
        }
        return depth;
    }
}