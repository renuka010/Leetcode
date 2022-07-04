class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        int i;
        
        for(i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]))
                result.add(nums2[i]);
        }
        set.clear();
        int[] r=new int[result.size()];
        i=0;
        for(int n:result)
            r[i++]=n;
        return r;
    }
}