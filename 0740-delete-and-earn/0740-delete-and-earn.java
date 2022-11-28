class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int prev=0, i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(prev!=x){
                nums[i++]=x;
            }
            prev=x;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(i==1)
            return map.get(nums[0])*nums[0];
        
        int[] res=new int[i];
        for(int j=0; j<i; j++){
            if(j !=0 && nums[j]==nums[j-1]+1){
                res[j]=Math.max(res[j-1],((j==1)?0:res[j-2])+map.get(nums[j])*nums[j]);
            }
            else{
                res[j]=((j==0)?0:res[j-1])+map.get(nums[j])*nums[j];
            }
        }
        
        return Math.max(res[i-1],res[i-2]);
    }
}