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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
       
        List<List<Integer>> al=new ArrayList<>();
         if(root==null)
             return al;
        q.add(root);
        int level=0;
        while(!q.isEmpty())
        {
            
            int n=q.size();
           // Stack<TreeNode> s=new Stack<>();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
              
                     TreeNode temp=q.poll();
                     //System.out.println(temp.val);
                     l.add(temp.val);
                     if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
            }
            if(level%2!=0)
                Collections.reverse(l);
            al.add(l);
            
            level++;
            
        }
        return al;
    }
}