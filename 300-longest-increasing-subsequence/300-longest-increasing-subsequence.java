class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS=new int[nums.length];
        int max=1;
        for(int i=nums.length-1; i>=0; i--){
            int n=nextElement(nums,i,LIS);
            if(n==-1)
                LIS[i]=1;
            else{
                LIS[i]=LIS[n]+1;
                max=Math.max(max,LIS[i]);
            }
        }
        return max;
    }
    public int nextElement(int[] nums, int n, int[] LIS){
        int max=-1, index=-1;
        for(int i=n+1; i<nums.length; i++){
            if(nums[i]>nums[n] && max<LIS[i]+1){
                max=LIS[i]+1;
                index=i;
            }
        }
        return index;
    }
}