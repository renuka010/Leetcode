class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n=nums.length;
        // int[] p1=new int[n];
        // int[] p2=new int[n];
        // p1[0]=nums[0];
        // p2[n-1]=nums[n-1];
        // for(int i=1; i<n; i++)
        //     p1[i]=nums[i]*p1[i-1];
        // for(int i=n-2; i>=0; i--)
        //     p2[i]=nums[i]*p2[i+1];
        // int first=p2[1];
        // for(int i=1; i<n-1; i++)
        //     p2[i]=p1[i-1]*p2[i+1];
        // p2[0]=first;
        // p2[n-1]=p1[n-2];
        // return p2;
        
        int left=1, right=1;
        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]=left;
            left*=nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }
}