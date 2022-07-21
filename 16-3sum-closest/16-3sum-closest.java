class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE, sum=0, n=nums.length;
        for(int i=0; i<n; i++){
            int l=i+1, r=n-1;
            while(l<r){
                int total=nums[i]+nums[l]+nums[r];
                int a=Math.abs(total-target);
                if(a<max){
                    sum=total;
                    max=a;
                }
                if(total>target)
                    r--;
                else
                    l++;
            }
        }
        return sum;
    }
}