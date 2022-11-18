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
    public int maxPathSum(TreeNode root) {
        int res[]=new int[1];
        res[0]=-1001;
        maxSum(root,res);
        return res[0];
    }
    
    public int maxSum(TreeNode root, int[] res){
        if(root==null)
            return 0;
        
        int x=maxSum(root.left,res);
        int y=maxSum(root.right,res);
        
        int ans=Math.max(root.val,Math.max(root.val+x,root.val+y));
        
        res[0]=Math.max(res[0],Math.max(ans,x+y+root.val));
        
        return ans;
        
    }
}