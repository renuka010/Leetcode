class Solution {
    public int numSteps(String s) {
        int steps=0, carry=0;;
        for(int i=s.length()-1; i>0; i--){
            int sum=s.charAt(i)-48+carry;
            if(sum==0){
                steps++;
            }
            else if(sum==2){
                carry=1;
                steps++;
            }
            else{
                if(sum==1){
                    carry=1;
                    steps+=2;
                }
            }
        }
        if(carry==1) steps++;
        return steps;
    }
}