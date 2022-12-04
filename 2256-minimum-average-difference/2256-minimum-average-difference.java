class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long left=0, right=0;
        
        for(int i=n-1; i>=0; i--)
            right+=nums[i];
        
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0; i<n; i++){
            left+=nums[i];
            right-=nums[i];
            int x=Math.abs((int)(left/(i+1) - right/(n-i-1==0?1:n-i-1)));
            if(x<min){
                min=x;
                res=i;
            }
            
        }
        return res;
    }
}