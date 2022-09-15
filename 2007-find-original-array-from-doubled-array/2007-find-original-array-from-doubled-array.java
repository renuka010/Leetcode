class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int l=changed.length, j=0;
        if(l%2 == 1)
            return new int[0];
        int[] res=new int[l/2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<l; i++){
            if(map.containsKey(changed[i])){
                int x=(int)map.get(changed[i]);
                if(x==1)
                    map.remove(changed[i]);
                else
                    map.put(changed[i],x-1);
                continue;
            }
            if(j==l/2)
                return new int[0];
            res[j++]=changed[i];
            map.put(changed[i]*2,map.getOrDefault(changed[i]*2,0)+1);
        }
        return res;
    }
}