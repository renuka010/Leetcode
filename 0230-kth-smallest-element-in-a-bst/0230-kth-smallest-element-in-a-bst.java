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
    public int kthSmallest(TreeNode root, int k) {
        
        Stack<TreeNode> s=new Stack<>();
        
        while(root!=null || !s.isEmpty()){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            
            root=s.pop();
            k--;
            if(k==0)
                return root.val;
            root=root.right;
        }
        
        return -1;
    }
}