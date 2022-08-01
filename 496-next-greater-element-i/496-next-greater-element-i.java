class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums1.length; i++)
            map.put(nums1[i],i);
        Stack<Integer> s=new Stack<>();
        Arrays.fill(nums1,-1);
        for(int i=0; i<nums2.length;i++){
            while(!s.isEmpty() && s.peek()<nums2[i])
                nums1[map.get(s.pop())]=nums2[i];
            if(map.containsKey(nums2[i]))
                s.push(nums2[i]);
        }
        return nums1;
    }
}