/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p,q);
        return res;
    }
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left;
        TreeNode right;
        if(root==null)
            return null;
        left=lca(root.left,p,q);
        right=lca(root.right,p,q);
        if(left!=null && right!=null){
            res=root;
            return root;
        }
        else if((root.val==p.val || root.val==q.val)&&(left!=null || right!=null)){
            res=root;
            return root;
        }
        else if(root.val==p.val ||root.val==q.val){
            return root;
        }
        else if(left!=null)
            return left;
        else
            return right;
    }
}