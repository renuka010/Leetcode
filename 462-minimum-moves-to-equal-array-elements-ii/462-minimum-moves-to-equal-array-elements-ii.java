class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int result=0;
        
        for(int i=0; i<nums.length; i++){
            result+=Math.max(mid-nums[i],nums[i]-mid);
        }
        
        return result;
    }
}