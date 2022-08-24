class Solution {
    public boolean areNumbersAscending(String s) {
        int x=-1, i=0, l=s.length();
        while(i<l){
            int n=0;
            boolean num=false;
            while(i<l && s.charAt(i)>='0' && s.charAt(i)<='9'){
                n=n*10+(s.charAt(i)-'0');
                i++;
                num=true;
            }
            if(!num){
                i++;
                continue;
            }
            if(n<=x)
                return false;
            else
                x=n;
            
        }
        return true;
    }
}