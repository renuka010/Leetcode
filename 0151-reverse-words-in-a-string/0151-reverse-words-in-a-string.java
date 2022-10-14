class Solution {
    public String reverseWords(String s) {
        char[] c=new char[s.length()];
        Stack<Character> stk=new Stack<>();
        int j=s.length()-1;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(!stk.isEmpty()){
                    while(!stk.isEmpty())
                        c[j--]=stk.pop();
                    c[j--]=' ';
                }
            }
            else{
                stk.push(ch);
            }
        }
        while(!stk.isEmpty())
            c[j--]=stk.pop();
        String res=new String(c);
        return res.trim();
    }
}