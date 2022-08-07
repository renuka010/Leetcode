class Solution {
    public int countVowelPermutation(int n) {
        long[][] nums=new long[n][5];
        Arrays.fill(nums[0],1);
        int mod=1000000007;
        for(int i=1; i<n; i++){
            nums[i][0]=(nums[i-1][1]+nums[i-1][2]+nums[i-1][4])%mod;
            nums[i][1]=(nums[i-1][0]+nums[i-1][2])%mod;
            nums[i][2]=(nums[i-1][1]+nums[i-1][3])%mod;
            nums[i][3]=nums[i-1][2];
            nums[i][4]=(nums[i-1][2]+nums[i-1][3])%mod;
        }
        long sum=0;
        for(long i:nums[n-1])
            sum+=i;
        return (int)(sum%mod);
    }
}