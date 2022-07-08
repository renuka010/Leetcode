class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
            pq.add(i);
        while(pq.size()!=1)
            pq.add(pq.poll()-pq.poll());
        return (int)pq.poll();
    }
}