class Solution {
    public int minOperations(String[] logs) {
        int x=0;
        for(int i=0; i<logs.length; i++){
            if(logs[i].contains("../"))
                x=Math.max(0,x-1);
            else if(logs[i].contains("./"))
                continue;
            else
                x++;
        }
        return x;
    }
}