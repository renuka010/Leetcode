class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int res=0, sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int prefix=sum-k;
            res+=map.getOrDefault(prefix,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}