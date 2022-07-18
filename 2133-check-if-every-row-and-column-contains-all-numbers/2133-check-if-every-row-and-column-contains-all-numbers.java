class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0; i<n; i++){
            Set<Integer> set1=new HashSet<>();
            Set<Integer> set2=new HashSet<>();
            
            for(int j=0; j<n; j++){
                
                if(!set1.add(matrix[i][j]))
                    return false;
                
                if(!set2.add(matrix[j][i]))
                    return false;
            }
        }
        return true;
    }
}