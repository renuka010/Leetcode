class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int res=n;
        int[] parent=new int[n];
        int[] rank=new int[n];
        
        for(int i=0; i<n; i++)
            parent[i]=i;
        Arrays.fill(rank,0);
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(isConnected[i][j]==1){
                    int iParent=find(i,parent);
                    int jParent=find(j,parent);
                    if(iParent!=jParent){
                        union(iParent,jParent,parent,rank);
                        res--;
                    }
                }
            }
        }
        return res;
    }
    
    public int find(int i, int[] parent){
        if(parent[i]==i)
            return i;
        return find(parent[i], parent);
    }
    
    public void union(int iParent,int jParent,int[] parent,int[] rank){
        if(rank[iParent]>rank[jParent]){
            parent[jParent]=iParent;
        }
        else if(rank[jParent]>rank[iParent]){
            parent[iParent]=jParent;
        }
        else{
            parent[iParent]=jParent;
            rank[jParent]++;
        }
    }
}