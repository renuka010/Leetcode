class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
        int[] arr2=new int[26];
        int i, l1=s1.length(), l2=s2.length(), match=0;;
        if(l1>l2)
            return false;
        for(i=0; i<l1; i++)
            arr[s1.charAt(i)-'a']++;
        for(i=0; i<l1; i++)
            arr2[s2.charAt(i)-'a']++;
        for(i=0; i<26; i++){
            if(arr[i]==arr2[i])
                match++;
        }
        if(match==26)
            return true;
        
        for(i=1; i<=l2-l1; i++){
            int c1=s2.charAt(i-1)-'a';
            int c2=s2.charAt(i+l1-1)-'a';
            
            if(arr[c1]==arr2[c1])
                match--;
            if(arr[c2]==arr2[c2])
                match--;

            arr2[c1]--;
            arr2[c2]++;
            
            if(arr[c2]==arr2[c2])
                match++;
            if(arr[c1]==arr2[c1])
                match++;
            
            if(match==26)
                return true;
        }
        return false;
    }
}