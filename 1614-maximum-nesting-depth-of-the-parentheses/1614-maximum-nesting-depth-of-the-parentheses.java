class Solution {
    public int maxDepth(String s) {
        int depth=0,top=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                top++;
                depth=Math.max(depth,top);
            }
            else if(s.charAt(i)==')')
                top--;
        }
        return depth;
    }
}