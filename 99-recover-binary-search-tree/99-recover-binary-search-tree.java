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
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode first=null, second=null;
        TreeNode curr=root;
        TreeNode prev=new TreeNode(Integer.MIN_VALUE);
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            if(s.peek().val<prev.val){
                if(first==null){
                    first=prev;
                    second=s.peek();
                }
                else{
                    second=s.pop();
                    break;
                }
            }
            prev=s.peek();
            curr=s.pop().right;
        }
        
        int x=first.val;
        first.val=second.val;
        second.val=x;
    }
}