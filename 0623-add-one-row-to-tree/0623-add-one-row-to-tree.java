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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1)
        {
            TreeNode node1 = new TreeNode(val);
            node1.left = root;
            root = node1;
        }else
        {
            addNode(root,val,depth,1);
            
        }
        return root;
    }

  TreeNode addNode(TreeNode root, int val, int depth, int currDepth)
    {
        if(root == null) return root;
        
        if(currDepth == depth-1)
        {
            TreeNode node1 = new TreeNode(val);
            TreeNode node2 = new TreeNode(val);
            
            node1.left = root.left;
            root.left = node1;
            
            node2.right = root.right;
            root.right = node2;
            
            return root;
        }
        currDepth++;
        addNode(root.left,val,depth,currDepth);
        addNode(root.right,val,depth,currDepth);
        
        return root;
        
    }
}