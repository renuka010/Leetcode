class Solution {
    public int countValidWords(String sentence) {
        int count=0;
        for(String s:sentence.split(" ")){
            boolean h=false;
            for(int i=0; i<s.length(); i++){
                char l=s.charAt(i);
                if((l>='0' && l<='9') || ((l==',' || l=='.' || l=='!')&& i!=s.length()-1) || (l=='-' && (i==0 || i==s.length()-1 || h)))
                    break;
                else if(l=='-'){ 
                    if (s.charAt(i-1)>='a' && s.charAt(i-1)<='z' && s.charAt(i+1)>='a' && s.charAt(i+1)<='z')
                        h=true;
                    else
                        break;
                }
                if(i==s.length()-1)
                    count++;
            }
        }
        return count;
    }
}