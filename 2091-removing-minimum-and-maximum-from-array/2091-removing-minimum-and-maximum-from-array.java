class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0, n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[min]>nums[i])
                min=i;
            if(nums[max]<nums[i])
                max=i;
        }
        if(n==1)
            return 1;
        else if(min<max)
            return Math.min(max+1,Math.min(n-min,n-max+min+1));
        else
            return Math.min(min+1,Math.min(n-max,n-min+max+1));
    }
}