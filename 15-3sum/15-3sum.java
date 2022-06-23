class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int low= i+1;
                int high= nums.length-1;
                while(low<high){
                    int sum=0-nums[i];
                    if(sum==nums[low]+nums[high]){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<nums.length-1 &&  nums[low+1]==nums[low]) low++;
                        while(high>i+1 && nums[high-1]==nums[high]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]>sum)
                        high--;
                    else
                        low++;
                }
            }
        }
        return result;
    }
}