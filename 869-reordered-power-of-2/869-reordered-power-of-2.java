class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countOfN=count(n);
        for(int i=0; i<32; i++){
            if(Arrays.equals(countOfN,count(1<<i)))
               return true;
        }
        return false;
    }
    public int[] count(int n){
        int[] arr=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        return arr;
    }
}