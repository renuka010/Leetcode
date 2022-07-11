class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res=new ArrayList<>();
        int i=0, n=nums.length;
        while(i<n){
            StringBuilder s=new StringBuilder();
            s.append(Integer.toString(nums[i]));
            int j=i;
            while(i+1<n && nums[i+1]-1==nums[i]){
                i++;
            }
            if(i!=j)
                s.append("->"+Integer.toString(nums[i]));
            res.add(s.toString());
            i++;
        }
        return res;
    }
}