class Solution {
    public int findPoisonedDuration(int[] nums, int duration) {
        int end=0, res=0;
        for(int i=0; i<nums.length; i++){
            if(end<nums[i]){
                res+=duration;
                end=nums[i]+duration-1;
            }
            else{
                res-=Math.abs(nums[i]-end)+1;
                res+=duration;
                end=nums[i]+duration-1;
            }
        }
        return (nums[0]==0)?res+1:res;
    }
}