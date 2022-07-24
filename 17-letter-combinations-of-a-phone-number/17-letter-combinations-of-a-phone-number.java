class Solution {
    Map<Character,String>  map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        if(digits.length()!=0)
            comb(digits,res,new StringBuilder(),0);
        return res;
    }
    public void comb(String digits,List<String> res, StringBuilder s, int n){
        if(n==digits.length()){
            res.add(s.toString());
            return;
        }
        String com=map.get(digits.charAt(n));
        for(int i=0; i<com.length(); i++){
            s.append(com.charAt(i));
            comb(digits,res,s,n+1);
            s.deleteCharAt(s.length()-1);
        }
    }
}