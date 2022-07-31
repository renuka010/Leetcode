class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] t=new int[n];
        for(int[] i:trust){
            t[i[0]-1]--;
            t[i[1]-1]++;
        }
        for(int i=0; i<n; i++){
            if(t[i]==n-1)
                return i+1;
        }
        return -1;
    }
}