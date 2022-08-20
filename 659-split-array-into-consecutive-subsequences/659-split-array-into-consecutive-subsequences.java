class Solution {
    public boolean isPossible(int[] nums) {
        int val=0, inval1=0, inval2=0, next=nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=next){
                if(inval1!=0 || inval2!=0)
                    return false;
                else{
                    val=0;
                    next=nums[i];
                    i--;
                }
            }
            else{
                next++;
                int x=1, n=nums[i];
                while(i+1<nums.length && nums[i+1]==n){
                    x++;
                    i++;
                }
                if(inval1+inval2>x)
                    return false;
                else{
                    x=x-inval1-inval2;
                    int nextinval1=0;
                    if(x!=0){
                        if(x<=val)
                            val=x;
                        else
                            nextinval1=x-val;
                    }
                    else{
                        val=0;
                    }
                    val+=inval2;
                    inval2=inval1;
                    inval1=nextinval1;
                }
            }
        }
        if(inval1!=0 || inval2!=0)
            return false;
        return true;
    }
}