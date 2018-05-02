/*
 * 783. Minimum Distance Between BST Nodes

Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class min_DiffInBST
{
     int min = Integer.MAX_VALUE;
     Integer prev = null;
    public int minDiffInBST(TreeNode root)
    {
         if (root == null) return min;
        
        minDiffInBST(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        minDiffInBST(root.right);
        
        return min;
    }
}