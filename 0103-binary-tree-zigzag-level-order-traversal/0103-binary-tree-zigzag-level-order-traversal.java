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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        q.add(root);
        int l=1, dir=1;
        while(!q.isEmpty()){
            int r=0;
            List<Integer> list=new ArrayList<>();
            while(l!=0){
                TreeNode node=q.poll();
                l--;
                if(dir==1)
                    list.add(node.val);
                else
                    list.add(0,node.val);
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
            dir=0-dir;
        }
        return res;
    }
}