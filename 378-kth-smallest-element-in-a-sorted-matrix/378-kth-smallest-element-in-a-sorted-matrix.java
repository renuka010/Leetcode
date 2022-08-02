class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Tuple> pq=new PriorityQueue<>();
        for(int i=0; i<matrix.length ;i++)
            pq.offer(new Tuple(0,i,matrix[0][i]));
        for(int i=k; k>1; k--){
            Tuple t=pq.poll();
            if(t.x==matrix.length-1)
                continue;
            pq.offer(new Tuple(t.x+1,t.y,matrix[t.x+1][t.y]));
        }
        return pq.poll().val;
    }
}

class Tuple implements Comparable<Tuple>{
    int x, y, val;
    public Tuple(int i,int j, int val){
        this.x=i;
        this.y=j;
        this.val=val;
    }
    @Override
    public int compareTo(Tuple that){
        return this.val-that.val;
    }
}