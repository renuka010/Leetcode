class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0], res=-1;;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>min)
                res=Math.max(nums[i]-min,res);
            else
                min=Math.min(min,nums[i]);
        }
        return res;
    }
}