class Solution {
    public int maxResult(int[] nums, int k) {
        int max=0;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[max];
            if(nums[i]>=nums[max])
                max=i;
            if(max==i-k){
                max=max+1;
                for(int j=max; j<=i;j++){
                    max=(nums[j]>=nums[max])?j:max;
                }
            }
        }
        return nums[nums.length-1];
    }
}