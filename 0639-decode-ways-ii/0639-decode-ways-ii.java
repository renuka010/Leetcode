class Solution {
    public int numDecodings(String s) {
        long prev2=1, prev1=(s.charAt(s.length()-1)=='0')?0:1;
        if(s.charAt(s.length()-1)=='*')
            prev1=9;
        int mod=1000000007;
        for(int i=s.length()-2; i>=0; i--){
            char c=s.charAt(i);
            char next=s.charAt(i+1);
            
            if(c-'0'>2 && c-'0'<=9){
                prev2=prev1;
            }
            else if(c=='0'){
                prev2=prev1;
                prev1=0;
            }
            else if(c=='*'){
                long temp=prev2;
                prev2=prev1;
                prev1=9*prev1;
                if((next-'0'>=0 && next-'0'<7))
                    prev1+=(2*temp);
                else if(next!='*')
                    prev1+=temp;
                else
                    prev1+=(15*temp);
            }
            else if(c=='1'){
                long temp=prev2;
                prev2=prev1;
                if(next=='*')
                    prev1+=(9*temp);
                else
                    prev1+=temp;
            }
            else if(c=='2'){
                long temp=prev2;
                prev2=prev1;
                if(next=='*')
                    prev1+=(6*temp);
                else if(next-'0'>=0 && next-'0'<7)
                    prev1+=temp;
            }
            prev1%=mod;
        }
        return (int)(prev1%mod);
    }
}