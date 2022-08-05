class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[26];
        int winSize=1;
        for(int i=0; i<s.length(); i++){
            if(i>0)
                arr[s.charAt(i-1)-'A']--;
            if(i+winSize>=s.length())
                break;
            arr[s.charAt(i+winSize-1)-'A']++;
            int j=i+winSize;
            
            while(j<s.length()){
                arr[s.charAt(j)-'A']++;
                if(winSize+1-max(arr)>k){
                    arr[s.charAt(j)-'A']--;
                    break;
                }
                else
                    winSize++;
                j++;
            }
        }
        return winSize;
    }
    public int max(int[] arr){
        int max=0;
        for(int k=1; k<26; k++){
            if(arr[k]>arr[max])
                max=k;
        }
        return arr[max];
    }
}