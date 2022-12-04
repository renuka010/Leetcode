class Tuple{
    int x, y;
    Tuple(int a, int b){
        x=a;
        y=b;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<Tuple>> map=new HashMap<>();
        for(int i=1; i<=n; i++)
            map.put(i,new ArrayList<Tuple>());
        
        for(int[] x:times)
            map.get(x[0]).add(new Tuple(x[1],x[2]));
        
        PriorityQueue<Tuple> pq=new PriorityQueue<>((a,b)->a.y-b.y);
        pq.offer(new Tuple(k,0));
        boolean[] visited=new boolean[n+1];
        int max=-1;
        
        while(!pq.isEmpty()){
            Tuple t=pq.poll();
            if(visited[t.x])
                continue;
            visited[t.x]=true;
            max=Math.max(max,t.y);
            List<Tuple> list=map.get(t.x);
            for(int i=0; i<list.size(); i++){
                if(!visited[list.get(i).x])
                    pq.offer(new Tuple(list.get(i).x,list.get(i).y+t.y));
            }
        }
        for(int i=1; i<=n; i++){
            if(!visited[i])
                return -1;
        }
        return max;
    }
}