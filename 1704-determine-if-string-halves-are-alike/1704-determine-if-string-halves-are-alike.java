class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int lcount=0, rcount=0, l=0, r=s.length()-1;
        
        while(l<r){
            if(set.contains(s.charAt(l)))
                lcount++;
            if(set.contains(s.charAt(r)))
                rcount++;
            l++;
            r--;
        }
        return lcount==rcount;
    }
}