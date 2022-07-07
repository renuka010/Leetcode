class Solution {
    public int rob(int[] nums) {
        int n=nums.length,i=3;
        if(n==1)
            return nums[0];
        else if(n==2)
            return Math.max(nums[0],nums[1]);
        else if(n==3)
            return Math.max(nums[1],nums[0]+nums[2]);
        
        nums[2]+=nums[0];
        while(i<n){
            nums[i]+=Math.max(nums[i-2],nums[i-3]);
            i++;
        }
        
        return Math.max(nums[i-1],nums[i-2]);
    }
}