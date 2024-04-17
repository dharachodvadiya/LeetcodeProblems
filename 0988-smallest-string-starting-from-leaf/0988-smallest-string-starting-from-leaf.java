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
        public String smallestFromLeaf(TreeNode root) {
            return smallestVal(root, new StringBuilder());
        }

        String smallestVal(TreeNode root, StringBuilder sb) {
        
            sb.insert(0,(char)(root.val + 'a'));
            if(root.left == null && root.right == null)
                return sb.toString();



            //System.out.println("left= " + sb);
            String left=null;
            if(root.left != null)
            {
                left = smallestVal(root.left,sb);
                sb.deleteCharAt(0);
            }


            //System.out.println("right= " + sb);
            String right=null;
            if(root.right != null)
            {
                right = smallestVal(root.right,sb);
                sb.deleteCharAt(0);
            }
            // System.out.println("left= " + left + ".. right= " + right + "..." + left.compareTo(right));
            if(left != null && right != null)
                return (left.compareTo(right) <0) ? left : right ;
            else if(left == null)
                return right;
            else
                return left;
            }
}