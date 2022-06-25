class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for(int row=0; row<=rowIndex; row++){
            
            result.add(1);
            
            for(int i = row; i>1; i--){
                result.set(i-1,result.get(i-1)+result.get(i-2));
            }
        }
        return result;
    }
}