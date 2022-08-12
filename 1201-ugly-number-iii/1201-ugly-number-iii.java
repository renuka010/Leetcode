class Solution {
    long ab,bc,ca,abc;
    public int nthUglyNumber(int n, int a, int b, int c) {
        long l=0, r=Integer.MAX_VALUE, res=-1;
        ab=lcm(1L*a,1L*b); bc=lcm(1L*b,1L*c); ca=lcm(1L*c,1L*a); abc=lcm(ab,1L*c);
        while(l<=r){
            long mid=l+(r-l)/2;
            if(count(a,b,c,mid)<n)
                l=mid+1;
            else{
                res=mid;
                r=mid-1;
            }
        }
        return (int)res;
    }
    public int count(int a,int b,int c,long num){
        long res= num/a+num/b+num/c+num/abc-num/ab-num/bc-num/ca;
        return (int)res;
    }
    public long lcm(long a, long b){
        long gcd=1,x=a,y=b;
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        gcd=(a==0)?b:a;
        long res=(x/gcd)*(y);
        return res;
    }
}