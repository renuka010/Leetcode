class Solution {
    public int maximum69Number (int num) {
        int div=10000;
        int res=0;
        while(div>0){
            int x=num/div;
            num%=div;
            div/=10;
            if(x==9)
                res=(res*10+9);
            else if(x==6){
                res=(res*10+9);
                while(num>0){
                    res=(res*10+num/div);
                    num%=div;
                    div/=10;
                }
                break;
            }
        }
        return res;
    }
}