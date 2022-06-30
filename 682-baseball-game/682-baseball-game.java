class Solution {
    public int calPoints(String[] ops) {
        int[] score=new int[ops.length];
        int k=0, sum=0;
        
        for(int i=0; i<ops.length; i++){
            String c=ops[i];
            if(c.equals("C")){
                sum-=score[k-1];
                k--;
            }
            else if(c.equals("D")){
                score[k]=score[k-1]*2;
                sum+=score[k++];
            }
            else if(c.equals("+")){
                score[k]=score[k-1]+score[k-2];
                sum+=score[k++];
            }
            else{
                score[k]=Integer.parseInt(c);
                sum+=score[k++];
            }
        }
        
        return sum;
    }
}