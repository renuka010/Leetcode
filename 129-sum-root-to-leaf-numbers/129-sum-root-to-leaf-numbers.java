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
    public int sumNumbers(TreeNode root) {
        int[] sum=new int[1];
        findSum(root,0,sum);
        return sum[0];
    }
    
    public void findSum(TreeNode root,int n, int[] sum){
        
        n=n*10+root.val;
        if(root.left==null && root.right==null){
            sum[0]+=n;
            return;
        }
        if(root.left!=null)
            findSum(root.left,n,sum);
        if(root.right!=null)
            findSum(root.right,n,sum);
    }
}