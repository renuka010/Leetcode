class Solution {
    public int minCost(String colors, int[] time) {
        int cost=0, prevnum=time[0];
        char prev=colors.charAt(0);
        for(int i=1; i<colors.length(); i++){
            char c=colors.charAt(i);
            if(c==prev){
                if(time[i]<prevnum){
                    cost+=time[i];
                }
                else{
                    cost+=prevnum;
                    prevnum=time[i];
                }
            }
            else{
                prev=c;
                prevnum=time[i];
            }
        }
        return cost;
    }
}