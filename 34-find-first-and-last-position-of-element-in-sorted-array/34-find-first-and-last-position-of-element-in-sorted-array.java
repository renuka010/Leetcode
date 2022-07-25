class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1, left=-1, right=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                left=findleft(nums,l,mid-1,target);
                right=findright(nums,mid+1,r,target);
                if(left==-1)
                    left=mid;
                if(right==-1)
                    right=mid;
                break;
            }
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return new int[]{left,right};
    }
    public int findleft(int[] nums, int l, int r, int target){
        int left=-1;
        if(l==r)
            return (nums[l]==target)?l:-1;
        if(l>r)
            return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            left=findleft(nums,l,mid-1,target);
            if(left==-1)
                left=mid;
        }
        else{
            left= findleft(nums,mid+1,r,target);
        }
        return left;
    }
    public int findright(int[] nums, int l, int r, int target){
        int right=-1;
        if(l==r)
            return (nums[l]==target)?l:-1;
        if(l>r)
            return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            right=findright(nums,mid+1,r,target);
            if(right==-1)
                right=mid;
        }
        else{
            return findright(nums,l,mid-1,target);
        }
        return right;
    }
}