class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        if(nums.length==1)
            return nums[0];
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value=map.get(nums[i])+1;
                map.put(nums[i],value);
                if(value>(nums.length/2))
                    return nums[i];
            }
            else
                map.put(nums[i],1);
        }
        return -1;
    }
}