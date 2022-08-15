class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>(){{
            put('V',5);
            put('L',50);
            put('D',500);
            put('M',1000);
        }};
        int res=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='I'){
                if(i!=s.length()-1 && s.charAt(i+1)=='V'){
                    res+=4;
                    i++;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='X'){
                    res+=9;
                    i++;
                }
                else
                    res+=1;
            }
            else if(c=='X'){
                if(i!=s.length()-1 && s.charAt(i+1)=='L'){
                    res+=40;
                    i++;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='C'){
                    res+=90;
                    i++;
                }
                else
                    res+=10;
            }
            else if(c=='C'){
                if(i!=s.length()-1 && s.charAt(i+1)=='D'){
                    res+=400;
                    i++;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='M'){
                    res+=900;
                    i++;
                }
                else
                    res+=100;
            }
            else{
                res+=(int)map.get(c);
            }
        }
        return res;
    }
}