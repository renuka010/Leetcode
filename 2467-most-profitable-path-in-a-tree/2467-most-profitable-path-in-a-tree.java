class Solution {
    int res=Integer.MIN_VALUE;
    HashMap<Integer,Integer> par;
    HashMap<Integer,ArrayList<Integer>> child;
    
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int n=amount.length;
        boolean[] visited=new boolean[n];
        
        for(int i=0; i<edges.length; i++){
            map.putIfAbsent(edges[i][0],new ArrayList<Integer>());
            map.get(edges[i][0]).add(edges[i][1]);
            
            map.putIfAbsent(edges[i][1],new ArrayList<Integer>());
            map.get(edges[i][1]).add(edges[i][0]);
        }
        
        par=new HashMap<>();
        child=new HashMap<>();
        
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0; i<n; i++){
            if(visited[i])
                continue;
            q.add(i);
            while(!q.isEmpty()){
                int y=q.poll();
                if(visited[y])
                    continue;
                
                ArrayList<Integer> list=map.get(y);
                for(int j=0; j<list.size(); j++){
                    int x=list.get(j);
                    if(visited[x])
                        continue;
                    child.putIfAbsent(y,new ArrayList<Integer>());
                    child.get(y).add(x);
                    par.put(x,y);
                    q.offer(x);
                }
                visited[y]=true;
            }
        }
        
        game(0,bob,0,0, amount);
        return res;
    }
    public void game(int apos, int bpos, int a, int b, int[] amt){
        int x=amt[apos], y=amt[bpos];
        if(apos==bpos){
            a+=(x/2);
            b+=(y/2);
        }
        else{
            a+=x;
            b+=y;
        }
        if(!child.containsKey(apos)){
            res=Math.max(res,a);
            return;
        }
        amt[apos]=0;
        amt[bpos]=0;
        
        List<Integer> list=child.get(apos);
        int parofbob=par.getOrDefault(bpos,0);
        for(int i=0; i<list.size(); i++){
            game(list.get(i), parofbob, a,b,amt);
        }
        
        amt[apos]=x;
        amt[bpos]=y;
    }
}