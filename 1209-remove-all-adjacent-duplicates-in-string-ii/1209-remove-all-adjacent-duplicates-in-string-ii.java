class Solution {
    class Pairs{
        int n;
        char c;
        Pairs(char c, int i){
            this.c=c;
            this.n=i;
        }
    }
    public String removeDuplicates(String s1, int k) {
        Stack<Pairs> s=new Stack<>();
        int count=0;
        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
            if(!s.isEmpty() && s.peek().c==c){
                s.push(new Pairs(c,s.peek().n+1));
                count++;
                if(s.peek().n==k){
                    for(int j=0; j<k; j++){
                        s.pop();
                        count--;
                    }
                }
            }
            else{
                s.push(new Pairs(c,1));
                count++;
            }
        }
        char[] c=new char[count];
        count-=1;
        while(!s.isEmpty()){
            c[count--]=s.pop().c;
        }
        return new String(c);
    }
}