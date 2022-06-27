class Solution {
    public int countElements(int[] nums) {
        int min=nums[0], max= nums[0], minCount=1, maxCount=1;
        for(int i=1; i<nums.length; i++){
            
            if(nums[i]<min){
                min=nums[i];
                minCount=1;
            }
            else if(nums[i]==min)
                minCount++;
            
            if(nums[i]>max){
                max=nums[i];
                maxCount=1;
            }
            else if(nums[i]==max)
                maxCount++;
            
        }
        
        if(minCount==nums.length)
            return 0;
        return nums.length-minCount-maxCount;
    }
}