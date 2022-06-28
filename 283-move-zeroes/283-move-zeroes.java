class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        
        //moving pointer j to next non zero element
        while(j!=nums.length && nums[j]==0)
            j++;
        
        while(j<nums.length){
            //checking each value in nums array
            if(nums[i]==0){
                nums[i++]=nums[j];
                nums[j]=0;
            }
            else
                i++;
            
            //moving pointer j to the next non zero element
            while(j!=nums.length && (nums[j]==0 || j<=i))
                j++;
        }
    }
}