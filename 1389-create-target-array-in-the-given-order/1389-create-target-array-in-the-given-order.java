class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> t=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            t.add(index[i],nums[i]);
        }
        int[] ans=new int[t.size()];
        int j=0;
        for(int i:t)
            ans[j++]=i;
        return ans;
    }
}