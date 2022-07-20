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
    public boolean isBalanced(TreeNode root) {
        int i=balancedCheck(root);
        return (i>=5000)?false:true;
    }
    public int balancedCheck(TreeNode root){
        if(root==null)
            return -1;
        int left=balancedCheck(root.left);
        int right=balancedCheck(root.right);
        if(left-right>1 || left-right<-1)
            return 5000;
        return Math.max(left,right)+1;
    }
}