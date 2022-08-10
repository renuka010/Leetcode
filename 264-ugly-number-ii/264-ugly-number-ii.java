class Solution {
    public int nthUglyNumber(int n) {
        int[] un=new int[n];
        int i=0,j=0,k=0,u1,u2,u3;
        un[0]=1;
        for(int x=1; x<n; x++){
            u1=un[i]*2;
            u2=un[j]*3;
            u3=un[k]*5;
            if(u1<=u2 && u1<=u3){
                un[x]=u1;
                i++;
                if(u1==u2)
                    j++;
                if(u1==u3)
                    k++;
            }
            else if(u2<=u3 && u2<=u1){
                un[x]=u2;
                j++;
                if(u1==u2)
                    i++;
                if(u2==u3)
                    k++;
            }
            else if(u3<=u2 && u3<=u1){
                un[x]=u3;
                k++;
                if(u1==u3)
                    i++;
                if(u2==u3)
                    j++;
            }
        }
        return un[n-1];
    }
}