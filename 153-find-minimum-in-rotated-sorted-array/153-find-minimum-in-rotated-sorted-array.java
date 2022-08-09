class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]<nums[r])
                return nums[l];
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[l])
                r=mid;
            else
                l=mid+1;
        }
        return  nums[l];
    }
}