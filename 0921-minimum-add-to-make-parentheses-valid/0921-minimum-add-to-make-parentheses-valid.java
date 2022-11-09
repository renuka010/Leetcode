class Solution {
    public int minAddToMakeValid(String s) {
        int i=0, open=0, close=0, res=0;
        while(i<s.length()){
            if(s.charAt(i)=='(')
                open++;
            else
                close++;
            if(close>open){
                res++;
                open++;
            }
            i++;
        }
        return (open>close)?res+open-close:res;
    }
}