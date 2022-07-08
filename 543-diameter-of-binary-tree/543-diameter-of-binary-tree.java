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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d=new int[1];
        dfs(root,d);
        return d[0];
    }
    public int dfs(TreeNode root, int[] d){
        if(root==null)
            return -1;
        int left=dfs(root.left,d);
        int right=dfs(root.right,d);
        d[0]=Math.max(left+right+2,d[0]);
        return Math.max(left,right)+1;
    }
}