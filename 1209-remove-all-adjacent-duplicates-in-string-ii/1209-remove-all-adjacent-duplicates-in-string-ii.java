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
        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
            if(!s.isEmpty() && s.peek().c==c){
                s.push(new Pairs(c,s.peek().n+1));
                if(s.peek().n==k){
                    for(int j=0; j<k; j++)
                        s.pop();
                }
            }
            else{
                s.push(new Pairs(c,1));
            }
        }
        String res="";
        while(!s.isEmpty()){
            res=s.pop().c+res;
        }
        return res;
    }
}