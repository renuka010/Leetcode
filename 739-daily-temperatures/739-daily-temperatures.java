class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s=new Stack<>();
        int[] res=new int[temp.length];
        for(int i=temp.length-1; i>=0; i--){
            while(!s.isEmpty() && temp[s.peek()]<=temp[i])
                s.pop();
            res[i]=(!s.isEmpty())?s.peek()-i:0;
            s.push(i);
        }
        return res;
    }
}