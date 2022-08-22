class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows=new ArrayList<>();
        int min=(numRows<s.length())?numRows:s.length();
        for(int i=0; i<min; i++)
            rows.add(new StringBuilder());
        int j=0;
        boolean dir=false;
        if(numRows==1)
            return s;
        for(int i=0; i<s.length(); i++){
            rows.get(j).append(s.charAt(i));
            if(dir){
                j--;
                if(j==-1){
                    j=1;
                    dir=false;
                }
            }
            else{
                j++;
                if(j==min){
                    j-=2;
                    dir=true;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0; i<min; i++)
            res.append(rows.get(i).toString());
        return res.toString();
    }
}