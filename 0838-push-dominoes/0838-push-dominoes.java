class Solution {
    public String pushDominoes(String dominoes) {
        char[] c=dominoes.toCharArray();
        int i=0;
        while(i<c.length){
            if(c[i]=='L' || c[i]=='R'){
                i++;
                continue;
            }
            int count=0, j=i;
            while(j<c.length && c[j]=='.'){
                count++;
                j++;
            }
            if(i==0 && j==c.length)
                break;
            else if(i==0){
                if(c[j]=='L')
                    fill(c,i,j,'L');
            }
            else if(j==c.length){
                if(c[i-1]=='R')
                    fill(c,i,j,'R');
            }
            else{
                if(c[i-1]=='R' && c[j]=='L'){
                    fill(c,i,(j+i)/2,'R');
                    fill(c,(j+i)/2,j,'L');
                    if((j+i)%2==1)
                        c[(j+i)/2]='.';
                }
                else if((c[i-1]=='R' && c[j]=='R')||(c[i-1]=='L' && c[j]=='L'))
                    fill(c,i,j,c[i-1]);
            }
            i=j+1;
        }
        return new String(c);
    }
    public void fill(char[] c, int start, int end, char ch){
        for(int i=start; i<end; i++)
            c[i]=ch;
    }
}