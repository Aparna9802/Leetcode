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
    public TreeNode search(TreeNode root,int val)
    {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        TreeNode node=null;
        if(root.val>val)
        {
            node=search(root.left,val);
            }
        else
            node=search(root.right,val);
        return node;
    }
    public TreeNode searchBST(TreeNode root, int val) {
       return search(root,val); 
    }
}