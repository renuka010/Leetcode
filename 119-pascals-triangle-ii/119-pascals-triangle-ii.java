class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        
        for(int i = 1; i<=rowIndex; i++){
            result.add((int)(result.get(i-1)*((long)rowIndex-i+1)/i));
        }
        
        return result;
    }
}