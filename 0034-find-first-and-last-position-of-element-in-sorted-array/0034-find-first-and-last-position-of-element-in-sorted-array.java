class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int left=find(nums,l,r,target,true);
        int right=find(nums,l,r,target,false);
        
        return new int[]{left,right};
    }
    public int find(int[] nums, int l, int r, int target, boolean left){
        while(l<=r){
            int mid=(l+r)/2;
            
            if(nums[mid]==target){
                if(left){
                    if(mid>0 && nums[mid-1]==target)
                        r=mid-1;
                    else
                        return mid;
                }
                else{
                    if(mid<nums.length-1 && nums[mid+1]==target)
                        l=mid+1;
                    else
                        return mid;
                }
            }
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
}