class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long[] left=new long[n];
        long[] right=new long[n+1];
        right[nums.length-1]=0;
        left[0]=nums[0];
        
        for(int i=1; i<n; i++)
            left[i]=left[i-1]+nums[i];
        for(int i=n-1; i>=0; i--)
            right[i]=right[i+1]+nums[i];
        
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0; i<n; i++){
            int x=Math.abs((int)(left[i]/(i+1) - right[i+1]/(n-i-1==0?1:n-i-1)));
            if(x<min){
                min=x;
                res=i;
            }
        }
        return res;
    }
}