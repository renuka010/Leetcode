class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n!=0){
                int digit=n%10;
                n=n/10;
                sum+=digit*digit;
            }
            if(s.contains(sum))
                return false;
            else
                s.add(sum);
            n=sum;
        }
        return (n==1);
    }
}