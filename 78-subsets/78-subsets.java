class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        subsetslist(res,nums,0,new ArrayList<Integer>());
        return res;
    }
    public void subsetslist(List<List<Integer>> res,int[] nums, int i,List<Integer> subset){
        for(int j=i; j<nums.length; j++){
            subset.add(nums[j]);
            res.add(new ArrayList<>(subset));
            subsetslist(res,nums,j+1,subset);
            subset.remove(subset.size()-1);
        }
    }
}