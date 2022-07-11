class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);
        if(nums.length != set.size())
            return true;
        return false;
    }
}