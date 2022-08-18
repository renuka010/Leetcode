class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int[] num=new int[map.size()];
        int i=0, sum=0, n=arr.length;
        for(Map.Entry e:map.entrySet()){
            num[i++]=(int)e.getValue();
        }
        Arrays.sort(num);
        for(i=num.length-1; i>=0; i--){
            sum+=num[i];
            if(sum>=n/2)
                return num.length-i;
        }
        return -1;
    }
}