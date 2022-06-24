class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean firsttime=true;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                if(firsttime==true){
                    firsttime=false;
                    if((i+2<nums.length && nums[i]<nums[i+2])|| i==nums.length-2)
                        i++;
                    else if(i!=0 && nums[i-1]>=nums[i+1])
                        return false;
                }
                else
                    return false;
            }
        }
        return true;
    }
}