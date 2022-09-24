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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        sum(res,new ArrayList<Integer>(),root,targetSum,0);
        return res;
    }
    
    public void sum(List<List<Integer>> res,List<Integer> list,TreeNode root, int tsum, int csum)
    {
        csum+=root.val;
        if(csum==tsum && root.left==null && root.right==null){
            list.add(root.val);
            res.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        }
        if(root.left!=null){
            list.add(root.val);
            sum(res,list,root.left,tsum,csum);
            list.remove(list.size()-1);
        }
        if(root.right!=null){
            list.add(root.val);
            sum(res,list,root.right,tsum,csum);
            list.remove(list.size()-1);
        }
    }
}