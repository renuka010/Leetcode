class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i:nums1)
            map.put(i,1);
        for(int i:nums2){
            if(map.containsKey(i)){
                if(map.get(i)==1){
                    res.add(i);
                    map.replace(i,0);
                }
            }
            else
                map.put(i,2);
        }
        for(int i:nums3){
            if(map.containsKey(i)){
                if(map.get(i)==1 || map.get(i)==2){
                    res.add(i);
                    map.replace(i,0);
                }
            }
        }
        return res;
    }
}