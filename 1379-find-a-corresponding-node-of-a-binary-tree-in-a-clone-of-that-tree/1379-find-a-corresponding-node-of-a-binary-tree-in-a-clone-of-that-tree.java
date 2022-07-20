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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode root=cloned;
        while(root!=null || !s.isEmpty()){
            while(!s.isEmpty() && root==null){
                root=s.pop().right;
            }
            if(root.val==target.val)
                return root;
            s.push(root);
            root=root.left;
        }
        return root;
    }
}