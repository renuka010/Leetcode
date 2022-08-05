class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
        int i, l1=s1.length(), l2=s2.length();
        for(i=0; i<l1; i++)
            arr[s1.charAt(i)-'a']++;
        for(i=0; i<=l2-l1; i++){
            if(perm(arr,s2,i,i+l1-1))
                return true;
        }
        return false;
    }
    public boolean perm(int[] arr, String s2, int start, int end){
        int[] arr2=arr.clone();
        for(int i=start; i<=end; i++){
            arr2[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr2[i]!=0)
                return false;
        }
        return true;
    }
}