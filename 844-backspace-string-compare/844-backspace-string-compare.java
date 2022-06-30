class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1=finalString(s);
        StringBuilder t1=finalString(t);
        
        return (s1.toString()).equals(t1.toString());
    }
    public StringBuilder finalString(String s){
        StringBuilder s1=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='#')
                s1.append(s.charAt(i));
            else{
                if(s1.length()!=0)
                    s1.deleteCharAt(s1.length()-1);
            }
        }
        return s1;
    }
}