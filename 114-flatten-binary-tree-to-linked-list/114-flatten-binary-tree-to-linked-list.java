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
    public void flatten(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.right!=null)
                s.push(curr.right);
            if(curr.left!=null){
                curr.right=curr.left;
                curr.left=null;
            }
            else if(!s.isEmpty())
                curr.right=s.pop();
            curr=curr.right;;
        }
    }
}