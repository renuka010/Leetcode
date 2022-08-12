class Solution {
    public int numSubseq(int[] nums, int t) {
        Arrays.sort(nums);
        int l=0, r=nums.length-1, t2=t/2;
        int count=0;
        int[] pow=new int[nums.length];
        pow[0]=1;
        for(int i=1; i<nums.length; i++){
            pow[i]=(2*pow[i-1]%1000000007);
        }
        while(l<r){
            if(nums[l]+nums[r]<=t){
                int num=r-l;
                count=((count+pow[num])%1000000007);
                l++;
            }
            else{
                r--;
            }
        }
        if(l<nums.length && nums[l]<=t/2)
            count++;
        return count;
    }
}