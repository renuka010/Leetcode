class Solution {
    public String pushDominoes(String d) {
        int l=0, r=0, len=d.length();
        boolean letter2=false;
        StringBuilder s=new StringBuilder();
        for(int i=0; i<len; i++){
            char c=d.charAt(i);
            if(c!='.'){
                if(c=='L'){
                    change(l,r,"L",s);
                    s.append(c);
                    l=r+1;
                }
                else
                    l=r;
                r=l;
                break;
            }
            else{
                s.append(c);
                r++;
            }
        }
        if(l!=r)
            return s.toString();
        for(int i=l; i<len; i++){
            char c=d.charAt(i);
            s.append(c);
            if(c=='L'){
                if(letter2){
                    change(l,r,"RL",s);
                    letter2=false;
                }
                else
                    change(l,r,"L",s);
                l=r+1;
            }
            else if(c=='R'){
                if(letter2)
                    change(l,r,"R",s);
                else
                    letter2=true;
                l=r+1;
            }
            r++;
        }
        if(letter2)
            change(l,r,"R",s);
        return s.toString();
    }
    public void change(int l, int r, String s, StringBuilder res){
        if(s.length()==2){
            while(l<r-1){
                res.setCharAt(l,'R');
                res.setCharAt(r-1,'L');
                l++;
                r--;
            }
        }
        else{
            char c=s.charAt(0);
            while(l<r){
                res.setCharAt(l,c);
                l++;
            }
        }
    }
}