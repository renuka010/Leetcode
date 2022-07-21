class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE, sum=0, n=nums.length;
        for(int i=0; i<n; i++){
            while(i!=0 && i<n-1 && nums[i]==nums[i-1])
                i++;
            int l=i+1, r=n-1;
            while(l<r){
                int total=nums[i]+nums[l]+nums[r];
                if(Math.abs(total-target)<max){
                    sum=total;
                    max=Math.abs(total-target);
                }
                if(total>target){
                    r--;
                    while(r>=0 && nums[r]==nums[r+1])
                        r--;
                }
                else{
                    l++;
                    while(l<n && nums[l]==nums[l-1])
                        l++;
                }
            }
        }
        return sum;
    }
}