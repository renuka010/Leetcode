class Solution {
    public int myAtoi(String s) {
        int i=0, l=s.length(), max=Integer.MAX_VALUE, min=Integer.MIN_VALUE;
        long res=0;
        while(i<l && s.charAt(i)==' '){
            i++;
        }
        if(i>=l)
            return (int)res;
        boolean neg=false;
        if(s.charAt(i)=='-'){
            neg=true;
            i++;
        }
        else if(s.charAt(i)=='+')
            i++;
        while(i<l){
            int x=0;
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                x=s.charAt(i)-'0';
                i++;
            }
            else
                break;
            if(neg){
                res=res*10-x;
                if(res<=min){
                    res=min;
                    break;
                }
            }
            else{
                res=res*10+x;
                if(res>=max){
                    res=max;
                    break;
                }
            }
        }
        return (int)res;
    }
}