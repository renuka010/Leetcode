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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
    public boolean dfs(TreeNode root, int currSum, int target){
        if(root!=null)
            currSum+=root.val;
        else
            return false;
        if(root.left==null && root.right==null)
            return currSum==target;
        return (dfs(root.left,currSum,target)||dfs(root.right,currSum,target));
    }
}