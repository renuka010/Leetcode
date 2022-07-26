class Solution {
    public int countOperations(int n1, int n2) {
        int steps=0;
        while(n1!=0 && n2!=0){
            if(n1>=n2){
                steps+=n1/n2;
                n1=n1%n2;
            }
            else{
                steps+=n2/n1;
                n2=n2%n1;
            }
        }
        return steps;
    }
}