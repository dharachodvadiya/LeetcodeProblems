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
    public int sumNumbers(TreeNode root) {
        return traversal(root,new StringBuilder('0'), 0);
    }
    static int traversal(TreeNode root, StringBuilder sb, int sum)
    {
        sb.append(root.val);
        if(root.left == null && root.right == null)
            return sum + Integer.parseInt(sb.toString());
            
        int count = 0;
        if(root.left != null)
        {
            count+=traversal(root.left,sb, sum); 
            sb.setLength(sb.length() - 1);
        }
        
        if(root.right != null)
        {
            count+=traversal(root.right,sb, sum);
            sb.setLength(sb.length() - 1);  
        }
            
       
        
            
        return count;
    }
}