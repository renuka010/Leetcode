class Solution {
    public int minOperations(String[] logs) {
        int x=0;
        for(String s: logs){
            if(s.contains("../"))
                x=Math.max(0,x-1);
            else if(s.contains("./"))
                continue;
            else
                x++;
        }
        return x;
    }
}