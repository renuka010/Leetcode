class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0, count=0, i=0;
        while(i!=s.length && child!=g.length){
            if(g[child]<=s[i]){
                count++;
                child++;
            }
        i++;
        }
        return count;
    }
}