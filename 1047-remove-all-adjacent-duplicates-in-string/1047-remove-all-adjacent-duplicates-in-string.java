class Solution {
    public String removeDuplicates(String s) {
        StringBuilder r=new StringBuilder(s);
        int i=0;
        while(i<r.length()-1){
            if(r.charAt(i)==r.charAt(i+1)){
                r.deleteCharAt(i);
                r.deleteCharAt(i);
                if(i!=0)
                    i--;
                continue;
            }
            i++;
        }
        return r.toString();
    }
}