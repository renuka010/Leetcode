class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0; i<k; i++){
            while(!q.isEmpty() && nums[i]>q.peek())
                q.poll();
            while(!q.isEmpty() && nums[i]>q.peekLast())
                q.pollLast();
            q.offer(nums[i]);
        }
        int[] res=new int[nums.length-k+1];
        int j=0;
        res[j++]=q.peek();
        for(int i=1; i<=nums.length-k; i++){
            if(q.peek()==nums[i-1])
                q.poll();
            while(!q.isEmpty() && nums[i+k-1]>q.peek())
                q.poll();
            while(!q.isEmpty() && nums[i+k-1]>q.peekLast())
                q.pollLast();
            
            q.offer(nums[i+k-1]);
            res[j++]=q.peek();
        }
        return res;
    }
}