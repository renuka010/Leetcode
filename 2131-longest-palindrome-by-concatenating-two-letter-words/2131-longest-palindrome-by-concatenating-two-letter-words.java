class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        int length=0;
        
        for(int i=0; i<words.length; i++){
            char c1=words[i].charAt(0);
            char c2=words[i].charAt(1);
            String rev=new String(new char[]{c2,c1});
            if(c1==c2){
                if(set.contains(words[i])){
                    length+=4;
                    set.remove(words[i]);
                }
                else{
                    set.add(words[i]);
                }
            }
            else{
                if(map.containsKey(words[i])){
                    map.put(words[i],map.get(words[i])+1);
                }
                else if(map.containsKey(rev)){
                    int x=map.get(rev);
                    if(x==1)
                        map.remove(rev);
                    else
                        map.put(rev,x-1);
                    length+=4;
                }
                else
                    map.put(words[i],1);
            }
        }
        return (set.size()!=0)?length+=2:length;
    }
}