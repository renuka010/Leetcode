class Solution {
    HashMap<Integer,Integer> map;
    public List<List<Integer>> permuteUnique(int[] nums) {
        map=new HashMap<>();
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i=0; i<nums.length; i++)
            map.put(nums[i],(int)(map.getOrDefault(nums[i],0))+1);
        permute(res,new ArrayList<Integer>(), nums);
        return res;
    }
    
    public void permute(List<List<Integer>> res, List<Integer> curr, int[] nums){
        
        if(curr.size()==nums.length){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        int prev=11;
        for(int i=0; i<nums.length; i++){
            
            if(prev==nums[i])
                continue;
            if(!map.containsKey(nums[i]))
                continue;
            
            int key=nums[i], value=(int)map.get(nums[i]);
            curr.add(key);
            if(value>1){
                map.put(key,value-1);
                permute(res,curr,nums);
                map.put(key,value);
            }
            else{
                map.remove(key);
                permute(res,curr,nums);
                map.put(key,value);
            }
            curr.remove(curr.size()-1);
            prev=nums[i];
        }
    }
}