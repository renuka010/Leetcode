class Solution {
    public int minFlips(String s) {

        if(s.length()%2==0){
            int flip=0;
            for(int i=0; i<s.length(); i++){
                if(i%2==1 && s.charAt(i)!='1')
                    flip++;
                else if(i%2==0 && s.charAt(i)!='0')
                    flip++;
            }
            return Math.min(flip,s.length()-flip);
        }
        
        StringBuilder code1=new StringBuilder();
        StringBuilder code2=new StringBuilder();
        for(int i=0; i<s.length()*2; i++){
            code1.append((i%2==1)?'1':'0');
            code2.append((i%2==1)?'0':'1');
        }
        
        s+=s;
        int flip1=0, flip2=0, n=s.length()/2, min=n+1;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n && i==0; j++){
                if(s.charAt(j)!=code1.charAt(j))
                    flip1++;
                if(s.charAt(j)!=code2.charAt(j))
                    flip2++;
            }
            if(i!=0){
                if(s.charAt(i-1)!=code1.charAt(i-1))
                    flip1--;
                if(s.charAt(i-1)!=code2.charAt(i-1))
                    flip2--;
                if(s.charAt(i+n-1)!=code1.charAt(i+n-1))
                    flip1++;
                if(s.charAt(i+n-1)!=code2.charAt(i+n-1))
                    flip2++;
            }
            min=Math.min(min,Math.min(flip1,flip2));
        }
        return Math.min(min, n-min);
    }
}