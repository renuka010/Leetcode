class Solution {
    public int search(int[] nums, int target) {
        int result=binarysearch(nums,0,nums.length-1,target);
        return result;
    }
    
    public int binarysearch(int[] nums, int start, int end, int target){
        int mid=(start+end)/2, result=-1;
        if(start>end)
            return -1;
        if(nums[mid]>target)
            result=binarysearch(nums,start,mid-1,target);
        else if(nums[mid]<target)
            result=binarysearch(nums,mid+1,end,target);
        else
            return mid;
        return result;
    }
}