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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        q.add(root);
        int l=1;
        while(!q.isEmpty()){
            int r=0;
            List<Integer> list=new ArrayList<>();
            while(l!=0){
                TreeNode node=q.poll();
                l--;
                list.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                    r++;
                }
                if(node.right!=null){
                    q.offer(node.right);
                    r++;
                }
            }
            res.add(list);
            l=r;
        }
        return res;
    }
}