class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(list.size()==0){
                list.add(i);
                continue;
            }
            int x=list.get(list.size()-1);
            if(i>x)
                list.add(i);
            else if(x>i)
                bs(list,i);
        } 
        return list.size();
    }
    public void bs(List<Integer> list, int x){
        int l=0, r=list.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            int n=list.get(mid);
            if(n==x)
                return;
            else if(n>x)
                r=mid-1;
            else
                l=mid+1;
        }
        list.set(l,x);
    }
}


