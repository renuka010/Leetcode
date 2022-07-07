class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int i=1, sum=nums[0];
        while(i<nums.length){
            sum+=nums[i];
            sum=Math.max(sum,nums[i]);
            max=Math.max(sum,max);
            i++;
        }
        return max;
    }
}