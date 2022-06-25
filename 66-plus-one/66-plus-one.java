class Solution {
    public int[] plusOne(int[] digits) {
        for(int last=digits.length-1; last>=0; last--){
            if(digits[last]!=9){
                digits[last]++;
                return digits;
            }
            else
                digits[last]=0;
        }
        int[] result= new int[digits.length+1];
        result[0]=1;
        return result;
    }
}