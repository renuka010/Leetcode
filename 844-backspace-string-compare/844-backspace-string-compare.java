class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1, j=t.length()-1;
        while(i>=0 || j>=0){
            int count=0;
            while(i>=0){
                if(s.charAt(i)=='#'){
                    count++;
                    i--;
                }
                else if(count>0){
                    count--;
                    i--;
                }
                else
                    break;
            }
            count=0;
            while(j>=0){
                if(t.charAt(j)=='#'){
                    count++;
                    j--;
                }
                else if(count!=0){
                    count--;
                    j--;
                }
                else
                    break;
            }
            if(i>-1 && j>-1 && s.charAt(i)!=t.charAt(j))
                return false;
            if((i>=0)!=(j>=0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}