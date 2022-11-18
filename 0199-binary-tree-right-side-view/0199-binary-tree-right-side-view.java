/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        int prev=0, count=1;
        List<Integer> res=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null)
            return res;
        q.offer(root);
        
        while(!q.isEmpty()){
            int cnt=0;
            while(count!=0){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                    cnt++;
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                    cnt++;
                }
                prev=q.poll().val;
                count--;
            }
            res.add(prev);
            count=cnt;
        }
        
        return res;
    }
}