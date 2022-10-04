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
    Set<TreeNode> set=new HashSet<TreeNode>();
    public int pathSum(TreeNode root, int targetSum) {
        int[] count=new int[1];
        if(root!=null)
            set.add(root);
        path(root,targetSum,count,0);
        return count[0];
    }
    
    public void path(TreeNode root,int t,int[] count, long currsum){
        if(root==null)
            return;
        currsum+=root.val;
        if(currsum==t)
            count[0]++;
        path(root.left,t,count,currsum);
        path(root.right,t,count,currsum);
        if(!set.contains(root)){
            set.add(root);
            path(root,t,count,0);
        }
    }
}