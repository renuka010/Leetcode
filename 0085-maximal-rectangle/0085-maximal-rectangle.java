class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        Stack<Integer> index=new Stack<>();
        Stack<Integer> val=new Stack<>();
        int res=0, j=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=matrix[0][i]-'0';
        
        for(int i=0; i<m; i++){
            int max=0;
            for(j=0; j<n; j++){
                int x=arr[j];
                int l=j;
                while(!val.isEmpty() && val.peek()>=x){
                    int v=val.pop();
                    int idx=index.pop();
                    l=idx;
                    if(v*(j-idx)>max)
                        max=v*(j-idx);
                }
                val.push(x);
                index.push(l);
            }
            while(!val.isEmpty()){
                int v=val.pop();
                int idx=index.pop();
                if(v*(j-idx)>max)
                    max=v*(j-idx);
            }
            res=(max>res)?max:res;
            
            if(i+1!=m){
                for(j=0; j<n; j++){
                    if(matrix[i+1][j]!='0')
                        arr[j]+=(matrix[i+1][j]-'0');
                    else
                        arr[j]=0;
                }
            }
        }
        return res;
    }
}