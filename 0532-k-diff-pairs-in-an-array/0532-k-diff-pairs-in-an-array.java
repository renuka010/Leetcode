class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        if(k==0){
            for(int x:nums){
                if(map.containsKey(x)){
                    if(map.get(x)==1){
                        map.put(x,2);
                        res++;
                    }
                }
                else
                    map.put(x,1);
            }
            return res;
        }
        
        for(int i:nums){
            if(!map.containsKey(i))
                res+=map.getOrDefault(i-k,0)+map.getOrDefault(i+k,0);
            map.put(i,1);
        }
        return res;
    }
}