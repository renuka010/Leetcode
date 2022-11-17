class Solution {
    public int computeArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int area= Math.abs((x1-x2)*(y1-y2))+Math.abs((x3-x4)*(y3-y4));
        
        if((x2<x3)||(x4<x1)||(y4<y1)||(y3>y2))
            return area;
        
        int a,b,c,d;
        a=Math.max(x1,x3);
        b=Math.max(y1,y3);
        c=Math.min(x2,x4);
        d=Math.min(y2,y4);
        
        area-=Math.abs((a-c)*(b-d));
        
        return area;
    }
}