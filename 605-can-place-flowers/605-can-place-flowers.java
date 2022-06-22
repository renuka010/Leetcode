class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0,i=0;
        if((flowerbed.length==1 && flowerbed[0]==0 && n==1)||n==0){
            return true;
        }
        while(i<flowerbed.length-1){
            if(flowerbed[i]==1 && flowerbed[i+1]==0)
                i++;
            else if(flowerbed[i]==0 &&flowerbed[i+1]==0){
                count++;
                i++;
            }
            i++;
            if(i==flowerbed.length-1 && flowerbed[i]==0)
                count++;
            if(count>=n)
                return true;
        }
        return false;
    }
}