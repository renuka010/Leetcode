class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(Map.Entry e:map.entrySet()){
            pq.offer(new int[]{(int)e.getKey(),(int)e.getValue()});
        }
        int[] res=new int[k];
        int i=0;
        while(k!=0){
            res[i++]=pq.poll()[0];
            k--;
        }
        return res;
    }
}