class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int left=0, right=s.length()-1;
        HashSet<Character> set=new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        while(left<right){
            char l=c[left];
            char r=c[right];
            if(set.contains(l)&&set.contains(r)){
                c[left++]=r;
                c[right--]=l;
            }
            else if(set.contains(l))
                right--;
            else
                left++;
        }
        return new String(c);
    }
}