class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        HashSet<String> set=new HashSet<>();
        for(int[] x:dig)
            set.add(x[0]+"-"+x[1]);
        
        int res=0;
        
        for(int[] x:artifacts){
            if(x[0]==x[2] && x[1]==x[3]){
                if(set.contains(x[0]+"-"+x[1]))
                    res++;
            }
            else if(x[0]==x[2]){
                if(!set.contains(x[0]+"-"+x[1]))
                    continue;
                while(x[1]!=x[3]){
                    x[1]++;
                    if(!set.contains(x[0]+"-"+x[1])){
                        res--;
                        break;
                    }
                }
                res++;
            }
            else if(x[1]==x[3]){
                if(!set.contains(x[0]+"-"+x[1]))
                    continue;
                while(x[0]!=x[2]){
                    x[0]++;
                    if(!set.contains(x[0]+"-"+x[1])){
                        res--;
                        break;
                    }
                }
                res++;
            }
            else if(set.contains(x[0]+"-"+x[1])&&set.contains(x[0]+"-"+x[3])&&set.contains(x[2]+"-"+x[1])&&set.contains(x[2]+"-"+x[3]))
                    res++;
        }
        return res;
    }
}