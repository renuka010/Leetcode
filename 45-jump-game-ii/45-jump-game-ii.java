class Solution {
    public int jump(int[] nums) {
        int jumps=0, farjump=0, last=0;
        for(int i=0; i<nums.length-1;i++){
            farjump=(farjump>i+nums[i])?farjump:nums[i]+i;
            if(i==last){
                jumps++;
                last=farjump;
            }
        }
        return jumps;
    }
}