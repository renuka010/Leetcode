class Solution {
    public String countAndSay(int n) {
        StringBuilder res=new StringBuilder();
        StringBuilder s=new StringBuilder("1");
        int i,j;
        for(j=2;j<=n;j++){
            i=0;
            while(i<s.length()){
                char el=s.charAt(i);
                int count=0;
                while(i<s.length() && s.charAt(i)==el){
                    count++;
                    i++;
                }
                res.append(Integer.toString(count));
                res.append(el);
            }
            s=res;
            res=new StringBuilder();
        }
        return s.toString();
    }
}