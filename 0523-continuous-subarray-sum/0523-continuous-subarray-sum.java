class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Long,Integer> map=new HashMap<>();
        long sum=0;
        map.put(0L,-1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            long x=sum%k;
            if(map.containsKey(x)){
                if(i-map.get(x)>=2)
                    return true;
            }
            else{
                map.put(x,i);
            }
        }
        return false;
    }
}