class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=nums[0], right=0;
        int count=0;
        for(int i=nums.length-1; i>0; i--)
            right+=nums[i];
        
        for(int i=0; i<nums.length-1; i++){
            if(left>=right)
                count++;
            left+=nums[i+1];
            right-=nums[i+1];
        }
        
        return count;
    }
}