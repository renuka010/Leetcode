class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        comb(candidates,0,target,res,new ArrayList<Integer>());
        return res;
    }
    public void comb(int[] candidates, int k, int t, List<List<Integer>> res, List<Integer> curr){
        
        if(t==0){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        else if(t<0)
            return;
        
        for(int i=k; i<candidates.length; i++){
            curr.add(candidates[i]);
            comb(candidates,i,t-candidates[i],res,curr);
            curr.remove(curr.size()-1);
        }
    }
}