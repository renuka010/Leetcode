class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>[] arr=new ArrayList[nums.length+1];
        int[] res=new int[k];
        for(Map.Entry e:map.entrySet()){
            int x=(int)e.getValue();
            if(arr[x]==null)
                arr[x]=new ArrayList<>();
            arr[x].add((int)e.getKey());
        }
        int i=nums.length, j=0;
        while(k!=0){
            if(arr[i]==null){
                i--;
                continue;
            }
            ListIterator<Integer> l=arr[i].listIterator();
            while(l.hasNext()){
                res[j++]=(int)l.next();
                k--;
            }
            i--;
        }
        return res;
    }
}