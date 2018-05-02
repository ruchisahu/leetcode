/*226. Invert Binary Tree
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1

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
class InvertTree
                 {
    public static TreeNode invertTree(TreeNode root) 
    {
       if(root == null || (root.left == null && root.right ==null))
            return root;
        
  
        TreeNode temp;
        temp=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=temp;
        return root;
    }
    
     public static void main(String[] arg)
    {
       
        TreeNode head = TreeFactory.createbstTree();
   
       System.out.println(invertTree(head));
      
}
}
     