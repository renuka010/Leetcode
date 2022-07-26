class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> set=new HashSet<>();
        Map<Integer, Integer> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> noloss=new ArrayList<>();
        List<Integer> oneloss=new ArrayList<>();
        for(int i=0; i<matches.length; i++){
            int lost=matches[i][1];
            if(map.containsKey(lost)){
                map.put(lost, map.get(lost) + 1);
            }
            else
                map.put(lost,1);
        }
        int val;
        for(int i=0; i<matches.length; i++){
            for(int j=0; j<2; j++){
                if(set.add(matches[i][j])){
                    if(map.containsKey(matches[i][j])){
                        val=map.get(matches[i][j]);
                        if(val==1)
                            oneloss.add(matches[i][j]);
                    }
                    else
                        noloss.add(matches[i][j]);
                }
            }
        }
        Collections.sort(noloss);
        res.add(noloss);
        Collections.sort(oneloss);
        res.add(oneloss);
        return res;
    }
}