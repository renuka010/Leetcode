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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        TreeNode curr=root;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        int count=0;
        
        while(curr!=null || !stack.isEmpty()){
            
            if(curr!=null){
                    stack.push(curr);
                    curr=curr.left;
            }
            else{
                curr=stack.peek().right;
                if(curr==null){
                    while(!stack.isEmpty() && stack.peek().right==curr){
                        curr=stack.pop();
                        result.add(curr.val);
                    }
                    if (!stack.isEmpty())
                        curr=stack.peek().right;
                    else
                        break;
                }
            }
        }
        
        return result;
    }
}