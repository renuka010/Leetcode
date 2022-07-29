class Solution {
    public int jump(int[] nums) {
        int[] jumps=new int[nums.length];
        jumps[0]=0;
        for(int i=0; i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length && j<=i+nums[i]){
                jumps[j]=(jumps[j]!=0 && jumps[j]<jumps[i]+1)?jumps[j]:1+jumps[i];
                j++;
            }
        }
        return jumps[nums.length-1];
    }
}