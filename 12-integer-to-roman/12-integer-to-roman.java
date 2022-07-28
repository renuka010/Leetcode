class Solution {
    public String intToRoman(int num) {
        int q,d;
        StringBuilder s=new StringBuilder();
        if(num>=1000)
            d=1000;
        else if(num>=100)
            d=100;
        else if(num>=10)
            d=10;
        else
            d=1;
        
        while(d!=0){
            q=num/d;
            num=num-q*d;
            if(d==1000){
                while(q>0){
                    s.append("M");
                    q--;
                }
            }
            else if(d==100){
                while(q>0){
                    if(q==9){
                        s.append("CM");
                        q=0;
                    }
                    else if(q==4){
                        s.append("CD");
                        q=0;
                    }
                    else if(q>=5){
                        s.append("D");
                        q-=5;
                    }
                    else{
                        s.append("C");
                        q--;
                    }
                }
            }
            else if(d==10){
                while(q>0){
                    if(q==9){
                        s.append("XC");
                        q=0;
                    }
                    else if(q==4){
                        s.append("XL");
                        q=0;
                    }
                    else if(q>=5){
                        s.append("L");
                        q-=5;
                    }
                    else{
                        s.append("X");
                        q--;
                    }
                }
            }
            else{
                while(q>0){
                    if(q==9){
                        s.append("IX");
                        q=0;
                    }
                    else if(q==4){
                        s.append("IV");
                        q=0;
                    }
                    else if(q>=5){
                        s.append("V");
                        q-=5;
                    }
                    else{
                        s.append("I");
                        q--;
                    }
                }
            }
            d/=10;
        }
        return s.toString();
    }
}