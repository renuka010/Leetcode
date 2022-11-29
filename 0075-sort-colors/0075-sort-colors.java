class Solution {
    public void sortColors(int[] nums) {
        int[] buckets=new int[3];
        for(int x:nums)
            buckets[x]++;
        buckets[1]+=buckets[0];
        buckets[2]+=buckets[1];
        int i,j=0;
        for(i=0; i<3; i++){
            while(j<buckets[i])
                nums[j++]=i;
        }
    }
}