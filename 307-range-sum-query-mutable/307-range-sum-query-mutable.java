class NumArray {
    private int[] arr;
    private int[] tree;
    private int n;
    
    public NumArray(int[] nums) {
        this.arr=nums;
        this.n=arr.length;
        this.tree=new int[n*2];
        buildtree();
    }
    public void buildtree(){
        for(int i=n, j=0; i<n*2; i++,j++){
            tree[i]=arr[j];
        }
        for(int i=n-1; i>0; i--){
            tree[i]=tree[i*2]+tree[i*2+1];
        }
    }
    
    public void update(int index, int val) {
        int x=index+n, prev=tree[x];
        while(x>0){
            tree[x]-=prev-val;
            x=x/2;
        }
    }
    
    public int sumRange(int l, int r) {
        int sum=0;
        l+=n; r+=n;
        while(l<=r){
            if(l%2==1){
                sum+=tree[l];
                l++;
            }
            if(r%2==0){
                sum+=tree[r];
                r--;
            }
            l/=2;
            r/=2;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */