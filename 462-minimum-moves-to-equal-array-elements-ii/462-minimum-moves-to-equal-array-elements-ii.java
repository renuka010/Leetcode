class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int result=0, i=0, j=nums.length-1;
        
        while(i<j)
            result+=nums[j--]-nums[i++];
        
        return result;
    }
}