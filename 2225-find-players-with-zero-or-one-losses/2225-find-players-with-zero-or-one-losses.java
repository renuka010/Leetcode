class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<matches.length; i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        
        List<Integer> list=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<Integer>();
        
        for(int i=0; i<matches.length; i++){
            if(!map.containsKey(matches[i][0]))
                set.add(matches[i][0]);
            if(map.get(matches[i][1])==1)
                list.add(matches[i][1]);
        }
        List<Integer> lst=new ArrayList<Integer>();
        lst.addAll(set);
        Collections.sort(lst);
        Collections.sort(list);
        return new ArrayList<List<Integer>>(Arrays.asList(lst,list));
    }
}