class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[]=new boolean[arr.length];
        return canU(visited,arr,start);
    }
    public boolean canU(boolean[] visited, int[] arr, int start){
        boolean ans=false;
        if(start>=0 && start<arr.length && !visited[start]){
            if(arr[start]==0)
                return true;
            visited[start]=true;
            ans= canU(visited,arr,start-arr[start])||canU(visited,arr,start+arr[start]);
            visited[start]=false;
        }
        return ans;
    }
}