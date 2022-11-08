class Solution {
    public String multiply(String num1, String num2) {
        int l1=num1.length(), l2=num2.length();
        int[] res=new int[l1+l2];
        Arrays.fill(res,0);
        
        for(int i=l1-1; i>=0; i--){
            int x=num1.charAt(i)-'0';
            for(int j=l2-1; j>=0; j--){
                int y=num2.charAt(j)-'0';
                int k=l1+l2-i-j-2;
                res[k]+=(x*y);
                res[k+1]+=(res[k]/10);
                res[k]%=10;
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i=res.length-1; i>=0; i--){
            if(s.length()==0 && res[i]==0)
                continue;
            s.append(res[i]);
        }
        return (s.length()==0)?"0":s.toString();
    }
}