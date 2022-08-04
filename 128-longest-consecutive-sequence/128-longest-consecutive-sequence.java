class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int count, max=0;;
        for(int x:nums)
            set.add(x);
        for(int x:nums){
            if(!set.contains(x-1)){
                count=1;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                if(count>max)
                    max=count;
            }
        }
        return max;
    }
}