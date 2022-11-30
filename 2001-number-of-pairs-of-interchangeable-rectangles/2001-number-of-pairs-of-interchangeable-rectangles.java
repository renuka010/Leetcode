class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Integer> map=new HashMap<>();
        for(int[] x:rectangles){
            double d=(x[0]*1.0d)/x[1];
            map.put(d,map.getOrDefault(d,0)+1);
        }
        long count=0;
        for(Map.Entry<Double,Integer> e:map.entrySet()){
            long n=(int)e.getValue();
            count+=(n*(n-1))/2;
        }
        return count;
    }
}