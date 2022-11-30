class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
            set.add(e.getValue());
        
        return map.size()==set.size();
    }
}