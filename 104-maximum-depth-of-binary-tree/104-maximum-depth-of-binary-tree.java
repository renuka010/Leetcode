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
    public int maxDepth(TreeNode root) {
        int count=0, max=0;
        Stack<TreeNode> stk=new Stack<>();
        Stack<Integer> cnt=new Stack<>();
        while(root!=null || !stk.isEmpty()){
            
            if(root==null){
                root=stk.pop();
                count=cnt.pop();
                while(root.right==null && !stk.isEmpty()){
                    count=cnt.pop();
                    root=stk.pop();
                }
                root=root.right;
            }
            if(root==null)
                break;
            count++;
            stk.push(root);
            cnt.push(count);
            root=root.left;
            max=Math.max(count,max);
        }
        return max;
    }
}