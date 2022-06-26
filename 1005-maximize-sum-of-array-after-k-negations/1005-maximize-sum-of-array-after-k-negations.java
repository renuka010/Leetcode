class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int min=0, sum=nums[0];
        while(k!=0){
            min=0;
            sum=nums[0];
            for(int i=0; i<nums.length-1; i++){
                if(nums[min]>nums[i+1])
                    min=i+1;
                if(k==1)
                    sum+=nums[i+1];
            }
            nums[min]=0-nums[min];
            k--;
        }
        sum=sum+2*nums[min];
        return sum;
    }
}