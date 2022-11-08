class Solution {
    public int minReorder(int n, int[][] con) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        
        for(int i=0; i<con.length; i++){
            map.putIfAbsent(con[i][0],new ArrayList<Integer>());
            List<Integer> list=map.get(con[i][0]);
            list.add(con[i][1]);
            
            map.putIfAbsent(con[i][1],new ArrayList<Integer>());
            List<Integer> list1=map.get(con[i][1]);
            list1.add(con[i][0]);
            
            set.add(con[i][0]+"-"+con[i][1]);
        }
        
        Queue<Integer> q=new LinkedList<>();
        int res=0;
        q.offer(0);
        while(!q.isEmpty()){
            int x=q.poll();
            
            List<Integer> list=map.get(x);
            for(int i=0; i<list.size(); i++){
                int y=list.get(i);
                if(visited[y])
                    continue;
                q.offer(y);
                if(set.contains(x+"-"+y))
                    res++;
            }
            visited[x]=true;
        }
        return res;
    }
}