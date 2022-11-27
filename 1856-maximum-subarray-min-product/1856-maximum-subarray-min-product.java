class Tuple{
    int val;
    int index;
    Tuple(){}
    Tuple(int x, int y){
        this.val=x;
        this.index=y;
    }
}
class Solution {
    public int maxSumMinProduct(int[] nums) {
        long[] sum=new long[nums.length];
        sum[0]=nums[0];
        int mod=1000000007;
        int i;
        long x;
        
        for(i=1; i<nums.length; i++)
            sum[i]=(sum[i-1]+nums[i]);
        
        long max=0;
        int prev=0;
        Stack<Tuple> s=new Stack<Tuple>();
        
        for(i=0; i<nums.length; i++){
            prev=i;
            while(!s.isEmpty() && nums[i]<s.peek().val){
                Tuple temp=s.pop();
                prev=temp.index;
                
                if(temp.index==0)
                    x=(sum[i-1]*temp.val);
                else
                    x=((sum[i-1]-sum[temp.index-1])*temp.val);
                
                if(x>max)
                    max=x;
            }
            s.push(new Tuple(nums[i], prev));
        }
        
        while(!s.isEmpty()){
            Tuple temp=s.pop();
            if(temp.index==0)
                max=Math.max(sum[i-1]*temp.val,max);
            else
                max=Math.max((sum[i-1]-sum[temp.index-1])*temp.val,max);
        }
        
        return (int)(max%mod);
    }
}