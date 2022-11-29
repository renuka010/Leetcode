class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(List list:wall){
            int sum=0;
            for(int i=0; i<list.size()-1; i++){
                if(i==0){
                    sum=(int)list.get(0);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
                else{
                    sum+=(int)list.get(i);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>max)
                max=e.getValue();
        }
        return wall.size()-max;
    }
}