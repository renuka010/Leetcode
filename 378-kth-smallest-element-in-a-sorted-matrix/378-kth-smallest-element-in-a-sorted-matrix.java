class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<matrix.length ;i++){
            for(int j=0; j<matrix.length; j++){
                pq.offer(matrix[i][j]);
            }
        }
        int x=0;
        while(k!=0){
            x=pq.poll();
            k--;
        }
        return x;
    }
}