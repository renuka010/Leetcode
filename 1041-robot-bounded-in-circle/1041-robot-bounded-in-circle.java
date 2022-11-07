class Solution {
    public boolean isRobotBounded(String inst) {
        int xdir=0, ydir=1;
        int x=0, y=0;
        
        for(int i=0; i<inst.length(); i++){
            char c=inst.charAt(i);
            if(c=='G'){
                x+=xdir;
                y+=ydir;
            }
            else if(c=='L'){
                int temp=xdir;
                xdir=0-ydir;
                ydir=temp;
            }
            else if(c=='R'){
                int temp=ydir;
                ydir=0-xdir;
                xdir=temp;
            }
        }
        if((x==0 && y==0)|| xdir!=0 || ydir!=1)
            return true;
        return false;
    }
}