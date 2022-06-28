class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0, end=numbers.length-1;
        int x=target-numbers[0];
        if(numbers[0]+numbers[1]==target)
            return new int[]{1,2};
        while(start<end){
            int mid=(start+end)/2;
            if(numbers[mid]<x)
                start=mid+1;
            else
                end=mid;
            
            if(start==end)
                break;
        }
        start=0;
        while(start<end){
            if(numbers[start]+numbers[end]==target)
                break;
            else if(numbers[start]+numbers[end]<target)
                start++;
            else
                end--;
        }
        return new int[]{start+1,end+1};
    }
}