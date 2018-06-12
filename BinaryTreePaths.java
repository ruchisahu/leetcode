/*257. Binary Tree Paths
    Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]
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
class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root)
    {
        List<String> res=new ArrayList<String>();
       dfs(res, root, "");
 return res;
}
private static void dfs(List<String> res, TreeNode root, String tmp) {
 if (root == null) return;
 if (root.left == null && root.right == null)
  res.add(tmp + root.val);
 dfs(res, root.left, tmp + root.val + "->");
 dfs(res, root.right, tmp + root.val + "->");
}

    public static void main(String[] arg)
   
    {
        BinaryTreePaths bst=new BinaryTreePaths();
        TreeNode head = TreeFactory.createbstTree();
       System.out.println(binaryTreePaths(head));
    
    }
    }
