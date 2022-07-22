class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        perm(res,nums,0);
        return res;
    }
    
    public void perm(List<List<Integer>> res, int[] nums, int start){
        if(nums.length==start+1)
            res.add(toList(nums));
        else{
            for(int i=start; i<nums.length; i++){
                swap(i,start,nums);
                perm(res,nums,start+1);
                swap(i,start,nums);
            }
        }
    }
    
    public void swap(int i, int start, int[] nums){
        int temp=nums[i];
        nums[i]=nums[start];
        nums[start]=temp;
    }
    
    public List<Integer> toList(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int n: nums)
            list.add(n);
        return list;
    }
}