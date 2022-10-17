class Solution {
    public int[] findOrder(int num, int[][] pre) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0; i<pre.length; i++){
            map.putIfAbsent(pre[i][0],new ArrayList<Integer>());
            map.get(pre[i][0]).add(pre[i][1]);
        }
        
        boolean[] visited=new boolean[num];
        boolean[] curr=new boolean[num];
        List<Integer> res=new ArrayList<>();
        for(int i=0; i<num; i++){
            if(!find(map,i,res,0,curr,visited))
                return new int[0];
        }
        int[] ans=new int[num];
        for(int i=0; i<num; i++)
            ans[i]=res.get(i);
        return ans;
    }
    
    public boolean find(HashMap<Integer,List<Integer>> map, int x, List<Integer> res, int k, boolean[]curr, boolean[] visited){
        
        if(visited[x])
            return true;
        if(curr[x])
            return false;
        
        curr[x]=true;
        List<Integer> list=map.getOrDefault(x,new ArrayList<Integer>());
        for(int i=0; i<list.size(); i++){
            if(!find(map,list.get(i),res,k,curr,visited))
                return false;
        }
        curr[x]=false;
        visited[x]=true;
        res.add(x);
        return true;
    }
}