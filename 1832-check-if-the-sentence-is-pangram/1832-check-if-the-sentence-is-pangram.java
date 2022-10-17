class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
            return false;
        boolean[] map=new boolean[26];
        int count=0;
        for(int i=0; i<sentence.length(); i++){
            int x=sentence.charAt(i)-'a';
            if(!map[x]){
                map[x]=true;
                count++;
                if(count==26)
                    return true;
            }
        }
        return false;
    }
}