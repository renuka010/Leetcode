class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int n:nums){
            if(set.contains(n))
                set.remove(n);
            else
                set.add(n);
        }
        return (int)set.toArray()[0];
    }
}