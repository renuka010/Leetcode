class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,j=0,k=0;
        int[] sqrs=new int[nums.length];
        while(nums[j]<0 && j!=nums.length-1)
            j++;
        i=j-1;
        
        while(i>=0 && j<nums.length){
            if(0-nums[i]<nums[j])
                sqrs[k++] = nums[i]*nums[i--];
            else
                sqrs[k++]=nums[j]*nums[j++];
        }
        
        while(i>=0)
            sqrs[k++]=nums[i]*nums[i--];
        
        while(j<nums.length)
            sqrs[k++]=nums[j]*nums[j++];
        
        return sqrs;
    }
}