class Solution {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++){
            if(boxes.charAt(i)=='0')
                continue;
            int k=1;
            for(int j=i-1; j>=0; j--)
                res[j]+=k++;
            k=1;
            for(int j=i+1; j<boxes.length(); j++)
                res[j]+=k++;
        }
        return res;
    }
}