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
    public int sumOfLeftLeaves(TreeNode root) {
        return traversal(root, false, 0);
    }
    
    int traversal(TreeNode root, boolean isLeft, int sum)
    {
        if(root.left == null && root.right == null && isLeft)
        {
             return sum + root.val;
        }
        
        if(root.left != null)
            sum += traversal(root.left, true,sum);
          
        if(root.right != null)
            sum += traversal(root.right, false,0);
          
        return sum;
    }
}