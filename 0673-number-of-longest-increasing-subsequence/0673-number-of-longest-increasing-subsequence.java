class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[][] lis=new int[nums.length][2];
        int count,max=0;
        for(int i=nums.length-1; i>=0; i--){
            count=0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>nums[i]){
                    if(lis[j][0]+1>lis[i][0]){
                        lis[i][0]=lis[j][0]+1;
                        count=lis[j][1];
                    }
                    else if(lis[j][0]+1==lis[i][0]){
                        count+=lis[j][1];
                    }
                }
            }
            if(lis[i][0]==0){
                lis[i][0]=1;
                lis[i][1]=1;
            }
            else
                lis[i][1]=count;
            
            if(lis[i][0]>max)
                max=lis[i][0];
        }
        count=0;
        for(int[] x:lis){
            if(x[0]==max)
                count+=x[1];
        }
        return count;
    }
}