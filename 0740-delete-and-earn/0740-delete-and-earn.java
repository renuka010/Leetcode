class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int prev=map.get(nums[0])*nums[0], prev2=0,curr;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1])
                continue;
            if(map.containsKey(nums[i]-1)){
                curr=Math.max(prev,prev2+map.get(nums[i])*nums[i]);
            }
            else{
                curr=prev+map.get(nums[i])*nums[i];
            }
            prev2=prev;
            prev=curr;
        }
        
        return prev;
    }
}