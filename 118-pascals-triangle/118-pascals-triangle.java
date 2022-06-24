class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        
        for(int line=0; line<numRows; line++){
            List<Integer> curr = new ArrayList<Integer>();
            if(line!=0)
                curr.add(1);
            
            for(int i=0; i<line-1; i++){
                curr.add(result.get(line-1).get(i)+result.get(line-1).get(i+1));
            }
            
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}