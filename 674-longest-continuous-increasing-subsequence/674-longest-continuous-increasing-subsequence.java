class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1, max=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i])
                count++;
            else{
                max=max>count?max:count;
                count=1;
            }
        }
        return (max>count?max:count);
    }
}