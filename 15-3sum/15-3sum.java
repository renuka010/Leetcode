class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
                break;
            while(i!=0 && i!=nums.length-1 && nums[i]==nums[i-1])
                i++;
            if(i>=nums.length)
                break;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]>0)
                    r--;
                else if(nums[l]+nums[r]+nums[i]<0)
                    l++;
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1])
                        l++;
                    while(l<r && nums[r]==nums[r-1])
                        r--;
                    l++;
                }
            }
        }
        return res;
        
    }
}