class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0,result=1, n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[min]>nums[i])
                min=i;
            if(nums[max]<nums[i])
                max=i;
        }
        min++;
        max++;
        if(min<max){
            result=n-(max-min-1);
            if(result>max)
                result=max;
            if(result>n-min+1)
                result=n-min+1;
        }
        else if(max<min){
            result=n-(min-max-1);
            if(result>min)
                result=min;
            if(result>n-max+1)
                result=n-max+1;
        }
        return result;
    }
}