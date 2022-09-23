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
    public int goodNodes(TreeNode root) {
        int[] count=new int[1];
        countNodes(root,root.val,count);
        return count[0];
    }
    
    public void countNodes(TreeNode curr, int val, int[] count){
        if(curr==null)
            return;
        if(curr.val >=val){
            val=curr.val;
            count[0]++;
        }
        countNodes(curr.left,val,count);
        countNodes(curr.right,val,count);
    }
}