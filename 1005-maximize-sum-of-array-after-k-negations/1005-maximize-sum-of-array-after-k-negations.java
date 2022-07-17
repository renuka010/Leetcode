class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        
        int i=0;
        while(k!=0 && i!=nums.length && nums[i]<0){
            nums[i]=0-nums[i];
            i++;
            k--;
        }
        if(k%2==1){
            if(i!=nums.length && i!=0 && nums[i]<nums[i-1])
                nums[i]=0-nums[i];
            else if(i==0)
                nums[0]=0-nums[0];
            else
                nums[i-1]=0-nums[i-1];
        }
        for(int j:nums)
            sum+=j;
        return sum;
    }
}