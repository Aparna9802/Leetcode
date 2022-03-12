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
    public int sum(TreeNode node,int low,int high)
    {
        if(node==null)
            return 0;
        int val=node.val;
        if(node.val<low || node.val>high)
             val=0;
       
        return val+sum(node.left,low,high)+sum(node.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return sum(root,low,high);
    }
}