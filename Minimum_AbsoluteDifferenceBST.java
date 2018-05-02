/*530. Minimum Absolute Difference in BST
    Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1
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
class Minimum_AbsoluteDifferenceBST
{
    public static int getMinimumDifference(TreeNode root)
    {
        
        if(root==null) return Integer.MAX_VALUE;
        
        int minLeft = getMinimumDifference(root.left);
        System.out.println(minLeft);
        int minRight = getMinimumDifference(root.right);
          System.out.println(minRight);
        if (root.left != null) {
            int max = max(root.left);
            int diff = Math.abs(max - root.val); 
            minLeft = Math.min(diff, minLeft);
        }
        if (root.right != null) {
            int min = min(root.right);
            int diff = Math.abs(min - root.val);
            minRight = Math.min(minRight, diff);
        }
        return Math.min(minLeft, minRight);
    }
    private static int max(TreeNode root) {
        if (root.right != null) {
            return max(root.right);
        }
        else {
            return root.val;
        }
    }
    
    private static int min(TreeNode root) {
        if (root.left != null) {
            return min(root.left);
        }
        else {
            return root.val;
        }
    }      
    int min = Integer.MAX_VALUE;
     Integer prev = null;
    
    public int getMinimumDifference1(TreeNode root)
    {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    } 
    public static void main(String[] arg)
    {
        Minimum_AbsoluteDifferenceBST bst=new Minimum_AbsoluteDifferenceBST();
        TreeNode head = TreeFactory.createbstTree();
     //   System.out.println(getMinimumDifference(head));
        bst.getMinimumDifference1(head);
    }
}