class Solution {
    public int minPartitions(String n) {
        int max=n.charAt(0)-'0';
        for(int i=1; i<n.length() && max!=9; i++)
            max=max>(n.charAt(i)-'0')? max:n.charAt(i)-'0';
        return max;
    }
}