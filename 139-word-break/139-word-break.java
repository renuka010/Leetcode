class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] letter=new boolean[n+1];
        letter[n]=true;
        for(int i=n-1; i>=0;i--){
            for(String word:wordDict){
                int w=word.length()-1, j=i+w;
                if(n-i-1<w)
                    continue;
                while(w!=-1 && s.charAt(j)==word.charAt(w)){
                    w--;
                    j--;
                }
                if(w==-1 && letter[i+word.length()]==true){
                    letter[i]=true;
                    break;
                }
            }
        }
        return letter[0];
    }
}