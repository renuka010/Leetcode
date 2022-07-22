class Solution {
    boolean[] visited;
    public boolean canFinish(int n, int[][] prereq) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        visited=new boolean[n];
        for(int i=0; i<prereq.length; i++){
            map.putIfAbsent(prereq[i][0],new ArrayList<Integer>());
            map.get(prereq[i][0]).add(prereq[i][1]);
        }
        for(int i=0; i<n; i++){
            if(!check(map,i))
                return false;
        }
        return true;
    }
    public boolean check(Map<Integer,List<Integer>> map,int i){
        if(!map.containsKey(i)){
            return true;
        }
        if(visited[i]==true)
            return false;
        visited[i]=true;
        List<Integer> list=map.get(i);
        for(int j=0; j<list.size(); j++){
            if(!check(map,list.get(j)))
                return false;
        }
        map.remove(i);
        return true;
    }
}