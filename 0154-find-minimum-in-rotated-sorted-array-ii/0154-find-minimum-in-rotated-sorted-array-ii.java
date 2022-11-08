class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[l]==nums[mid] && nums[mid]==nums[r]){
                int min=nums[l];
                for(int i=l+1; i<=r; i++){
                    if(nums[i]<min)
                        return nums[i];
                }
                return min;
            }
            else if(nums[l]<nums[r])
                return nums[l];
            else if(nums[mid]>nums[r])
                l=mid+1;
            else
                r=mid;
        }
        return nums[r];
    }
}