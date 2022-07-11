class Solution {
    public String reverseVowels(String s) {
        int l=0, r=s.length()-1;
        StringBuilder result=new StringBuilder(s);
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(l<r){
            while(l<r && !set.contains(s.charAt(l)))
                l++;
            while(l<r && !set.contains(s.charAt(r)))
                r--;
            
            if(l<r){
                result.setCharAt(l,s.charAt(r));
                result.setCharAt(r,s.charAt(l));
            }
            l++;
            r--;
        }
        return result.toString();
    }
}