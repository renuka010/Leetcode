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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] p=new int[1];
        return build(preorder,inorder,p,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int[] p, int x, int y){
        
        TreeNode root=new TreeNode(preorder[p[0]++]);
        for(int i=x; i<=y; i++){
            if(root.val==inorder[i]){
                if(x>i-1)
                    root.left=null;
                else{
                    root.left=build(preorder,inorder,p,x,i-1);
                }
                if(i+1>y)
                    root.right=null;
                else{
                    root.right=build(preorder,inorder,p,i+1,y);
                }
                break;
            }
        }
        
        return root;
    }
}