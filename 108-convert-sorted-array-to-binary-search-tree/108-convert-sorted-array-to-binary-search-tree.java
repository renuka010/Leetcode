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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
    
    public int bs(int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            return mid;
        }
        return left;
    }
    
    public TreeNode bst(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid=bs(left,right);
        TreeNode t=new TreeNode(nums[mid]);
        t.left=bst(nums,left,mid-1);
        t.right=bst(nums,mid+1,right);
        return t;
    }
}