class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS=new int[nums.length];
        int max=0;
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    LIS[i]=Math.max(LIS[i], LIS[j]+1);
                }
            }
            max=Math.max(max,LIS[i]);
        }
        return max+1;
    }
}