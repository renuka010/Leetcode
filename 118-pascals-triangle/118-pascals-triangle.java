class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        result.add(prev);
        
        for(int line=1; line<numRows; line++){
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            prev=result.get(line-1);
            
            for(int i=0; i<line-1; i++){
                curr.add(prev.get(i)+prev.get(i+1));
            }
            
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}