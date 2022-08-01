class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> s=new Stack();
        for(int j=0; j<2; j++){
            for(int i=0; i<nums.length; i++){
                while(!s.isEmpty() && nums[s.peek()]<nums[i])
                    res[s.pop()]=nums[i];
                s.push(i);
            }
        }
        return res;
    }
}