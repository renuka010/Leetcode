class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs=0, shots=minutesToTest/minutesToDie, row=shots+1;
        while(Math.pow(row,pigs)<buckets)
            pigs++;
        return pigs;
    }
}