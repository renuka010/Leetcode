class Solution {
    public int search(int[] nums, int t) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==t)
                return mid;
            else if(l==mid)
                l++;
            else if(nums[mid]>nums[l] && nums[r]>nums[mid]){
                if(t<nums[mid])
                    r=mid-1;
                else
                    l=mid+1;
            }
            else if(nums[r]<nums[l] && nums[l]<nums[mid]){
                if(t<nums[mid] && t>=nums[l])
                    r=mid-1;
                else
                    l=mid+1;
            }
            else if(nums[mid]<nums[r] && nums[r]<nums[l]){
                if(t>nums[mid] && t<=nums[r])
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return -1;
    }
}