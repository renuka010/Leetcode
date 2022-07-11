class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i]))
                map.compute(nums1[i],(key,val)->val+1);
            else
                map.put(nums1[i],1);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                ans.add(nums2[i]);
                if(map.get(nums2[i])>1)
                    map.compute(nums2[i],(key,val)->val-1);
                else
                    map.remove(nums2[i]);
            }
        }
        
        int[] a= new int[ans.size()];
        int j=0;
        Iterator<Integer> i= ans.iterator();
        while(i.hasNext())
            a[j++]=i.next().intValue();
        return a;
    }
}