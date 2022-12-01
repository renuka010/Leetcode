class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int win=0;
        List<String> list=new ArrayList<>();
        StringBuilder s1=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(win<10){
                s1.append(s.charAt(i));
                win++;
            }
            else{
                s1.append(s.charAt(i));
                s1.deleteCharAt(0);
            }
            
            if(win==10){
                int x=map.getOrDefault(s1.toString(),0);
                if(x==1){
                    list.add(new String(s1.toString()));
                    map.put(new String(s1.toString()),2);
                }
                else if(x==0){
                    map.put(new String(s1.toString()),1);
                }
            }
        }
        return list;
    }
}