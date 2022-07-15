class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}