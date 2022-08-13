class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(String s:words1){
            map.put(s, map.getOrDefault(s,2)-1);
        }
        for(String s:words2){
            if(map.containsKey(s)){
                int x=map.get(s);
                if(x==1){
                    map.put(s,2);
                    count++;
                }
                else if(x==2){
                    count--;
                    map.put(s,0);
                }
            }
        }
        return count;
    }
}