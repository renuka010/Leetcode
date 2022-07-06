class Solution {
    public int fib(int n) {
        int a=0,b=1,i=1;
        if(n==0)
            return a;
        while(i<n){
            int temp=a+b;
            a=b;
            b=temp;
            i++;
        }
        return b;
    }
}