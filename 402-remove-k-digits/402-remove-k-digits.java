class Solution {
    public String removeKdigits(String s, int k) {
        StringBuilder res=new StringBuilder();
        int n=s.length()-1, x=k;
        for(int i=0; i<=n; i++){
            int l=res.length();
            if(s.charAt(i)=='0'){
                if(k>=l){
                    res=new StringBuilder();
                    k-=l;
                }
                else if(l>k){
                    res.delete(l-k,l);
                    k=0;
                    res.append('0');
                }
            }
            else{
                while(l>0 && res.charAt(l-1)>s.charAt(i) && k!=0){
                    res.deleteCharAt(l-1);
                    k--;
                    l--;
                }
                res.append(s.charAt(i));
            }
        }
        if(k>=res.length())
            return "0";
        else if(k>0)
            return res.substring(0,res.length()-k);  
        return (res.length()==0)?"0":res.toString();
    }
}