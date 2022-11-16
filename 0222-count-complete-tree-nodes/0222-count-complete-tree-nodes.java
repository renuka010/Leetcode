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
    public int countNodes(TreeNode root) {
        
        int x=leftCount(root);
        if(x==rightCount(root)){
            return (int)(Math.pow(2,x))-1;
        }
        
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    
    public int leftCount(TreeNode root){
        if(root==null)
            return 0;
        
        int count=0;
        while(root!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    
    public int rightCount(TreeNode root){
        if(root==null)
            return 0;
        
        int count=0;
        while(root!=null){
            count++;
            root=root.right;
        }
        return count;
    }
}