class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean wrong1stTime=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(!wrong1stTime)
                    return false;
                else
                    wrong1stTime=false;
                if(i!=nums.length-2 && nums[i]<nums[i+2])
                    i++; 
                else if(i!=0 && i!=nums.length-2 && nums[i-1]>nums[i+1])
                    return false;
            }
        }
        return true;
    }
}