class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        genPara(0,0,n,res,new StringBuilder());
        return res;
    }
    public void genPara(int nO,int nC,int n,List<String> res,StringBuilder s){
        if(s.length()==n*2){
            res.add(s.toString());
        }
        else if(nO<n && nC<nO){
            s.append("(");
            genPara(nO+1,nC,n,res,s);
            s.deleteCharAt(s.length()-1);
            s.append(")");
            genPara(nO,nC+1,n,res,s);
            s.deleteCharAt(s.length()-1);
        }
        else if(nC<nO){
            s.append(")");
            genPara(nO,nC+1,n,res,s);
            s.deleteCharAt(s.length()-1);
        }
        else if(nO<n){
            s.append("(");
            genPara(nO+1,nC,n,res,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}