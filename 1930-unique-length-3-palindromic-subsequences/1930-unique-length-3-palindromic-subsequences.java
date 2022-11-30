class Tuple{
    int x,y;
    Tuple(int a, int b){
        x=a;
        y=b;
    }
}
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        int[] left=new int[26];
        int[] right=new int[26];
        Arrays.fill(left,-1);
        int j;
        for(int i=0; i<n; i++){
            j=s.charAt(i)-'a';
            if(left[j]==-1)
                left[j]=i;
            right[j]=i;
        }
        int count=0;
        for(int i=0; i<26; i++){
            boolean[] map=new boolean[26];
            for(j=left[i]+1; j<right[i]; j++){
                if(map[s.charAt(j)-'a'])
                    continue;
                map[s.charAt(j)-'a']=true;
                count++;
            }
        }
        return count;
    }
}