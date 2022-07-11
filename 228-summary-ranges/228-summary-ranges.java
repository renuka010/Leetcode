class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res=new ArrayList<>();
        int i=0, n=nums.length;
        while(i<n){
            int s=nums[i];
            while(i+1<n && nums[i+1]-1==nums[i]){
                i++;
            }
            if(s!=nums[i])
                res.add(s+"->"+nums[i]);
            else
                res.add(Integer.toString(s));
            i++;
        }
        return res;
    }
}