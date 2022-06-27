class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i=1, count=0;
        while(i!=nums.length){
            if(nums[i-1]>=nums[i]){
                count+=nums[i-1]-nums[i]+1;
                nums[i]+=nums[i-1]-nums[i]+1;
            }
            i++;
        }
        return count;
    }
}