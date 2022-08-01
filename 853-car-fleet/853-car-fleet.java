class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        double[][] cars=new double[pos.length][2];
        for(int i=0; i<pos.length; i++){
            cars[i][0]=pos[i];
            cars[i][1]=((double)target-pos[i])/speed[i];
        }
        Arrays.sort(cars, (a,b)->Double.compare(a[0],b[0]));
        int fleets=1;
        double start=cars[pos.length-1][1];
        for(int i=pos.length-2; i>=0; i--){
            if(cars[i][1]>start){
                fleets++;
                start=cars[i][1];
            }
        }
        return fleets;
    }
}