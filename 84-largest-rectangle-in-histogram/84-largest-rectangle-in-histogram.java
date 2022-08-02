class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int[] Pmin=new int[n];
        int[] Nmin=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && h[s.peek()]>=h[i]){
                Nmin[s.peek()]=i;
                s.pop();
            }
            if(!s.isEmpty())
                Pmin[i]=s.peek();
            else
                Pmin[i]=-1;
            s.push(i);
        }
        while(!s.isEmpty())
            Nmin[s.pop()]=n;
        int max=0;
        for(int i=0; i<n; i++){
            int area=(Nmin[i]-Pmin[i]-1)*h[i];
            if(area>max)
                max=area;
        }
        return max;
    }
}