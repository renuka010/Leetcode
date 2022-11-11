class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0], count=1, i=1, j=1;
        while(i<nums.length){
            if(nums[i]!=prev){
                prev=nums[i];
                count=1;
                nums[j++]=nums[i++];
            }
            else if(count==1){
                count++;
                nums[j++]=nums[i++];
            }
            else{
                i++;
            }
        }
        return j;
    }
}