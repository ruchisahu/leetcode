/*94. Binary Tree Inorder Traversal
    
    Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
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
import java.util.*;
class Inorder 
{
    static List<Integer> result = new ArrayList<Integer>();
    public static List<Integer> inorderTraversal(TreeNode root) 
    {
        if(root!=null)
        {
        inorderTraversal(root.left); 
            result.add(root.val);
        inorderTraversal(root.right); 
        }
        return result;
    }
    public static void main(String[] arg)
    {
        TreeNode head = TreeFactory.createbstTree();
        System.out.println(inorderTraversal(head));
    }
}