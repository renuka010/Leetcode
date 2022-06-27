class Solution {
    public int minPartitions(String n) {
        char[] num=n.toCharArray();
        int max=Character.getNumericValue(num[0]);
        for(int i=1; i<num.length && max!=9; i++)
            max=max>Character.getNumericValue(num[i])? max:Character.getNumericValue(num[i]);
        return max;
    }
}