class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        char[] res=s.toCharArray();
        for(int i=0; i<res.length; i++)
            map.put(res[i],map.getOrDefault(res[i],0)+1);
        
        for(Map.Entry<Character,Integer> e:map.entrySet())
            pq.offer(e);
        
        int i=0;
        while(!pq.isEmpty()){
            int x=pq.peek().getValue();
            char c=pq.poll().getKey();
            while(x!=0){
                res[i++]=c;
                x--;
            }
        }
        return new String(res);
    }
}