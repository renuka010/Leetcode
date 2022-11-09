class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> prev=triangle.get(triangle.size()-1);
        for(int i=triangle.size()-2; i>=0; i--){
            List<Integer> curr=triangle.get(i);
            for(int j=0; j<curr.size(); j++)
                curr.set(j,Math.min(prev.get(j), prev.get(j+1))+curr.get(j));
            prev=curr;
        }
        return prev.get(0);
    }
}