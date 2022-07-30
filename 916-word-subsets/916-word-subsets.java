class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] arr1=new int[26];
        int i;
        List<String> res=new ArrayList<>();
        
        for(String s:words2){
            int[] arr2=new int[26];
            for(i=0; i<s.length(); i++)
                arr2[s.charAt(i)-'a']++;
            for(i=0; i<26; i++){
                if(arr2[i]>arr1[i])
                    arr1[i]=arr2[i];
            }
        }
        
        for(String s:words1){
            boolean issubset=true;
            int[] arr2=new int[26];
            for(i=0; i<s.length(); i++)
                arr2[s.charAt(i)-'a']++;
            for(i=0; i<26; i++){
                if(arr1[i]>arr2[i]){
                    issubset=false;
                    break;
                }
            }
            if(issubset)
                res.add(s);
        }
        return res;
    }
}