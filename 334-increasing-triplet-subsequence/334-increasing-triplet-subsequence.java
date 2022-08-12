class Solution {
    public boolean increasingTriplet(int[] nums) {
        long[] arr=new long[3];
        int min=Integer.MIN_VALUE;
        arr[0]=nums[0];
        arr[1]=min;
        arr[2]=min;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=arr[0])
                arr[0]=nums[i];
            else if(nums[i]<=arr[1])
                arr[1]=nums[i];
            else if(nums[i]<=arr[2])
                arr[2]=nums[i];
            else if(arr[1]==min)
                arr[1]=nums[i];
            else if(arr[2]==min)
                arr[2]=nums[i];
        }
        if(arr[0]<arr[1] && arr[1]<arr[2])
            return true;
        else
            return false;
    }
}