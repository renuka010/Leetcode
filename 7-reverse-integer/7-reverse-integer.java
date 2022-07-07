class Solution {
    public int reverse(int x) {
        int res=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(x!=0){
            int digit=x%10;
            x/=10;
            if(res>max/10 || (res==max/10 && digit>7))
                return 0;
            if(res<min/10 || (res==min/10 && digit<-8))
                return 0;
            
            res=res*10+digit;
        }
        return res;
    }
}