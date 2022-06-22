class Solution {
    public int removeElement(int[] nums, int val) {
        int i, occurrence=0;
        if(nums.length==0)
            return 0;
        for(i=0;i<nums.length-1-occurrence;i++){
            if(nums[i]== val){
                nums[i]=nums[nums.length-1-occurrence];
                nums[nums.length-1-occurrence]=val;
                occurrence++;
                i--;
            }
        }
        if(nums[i]==val){
            return i;
        }
        return i+1;
    }
}