//Flatten Binary Tree to Linked List

class FlatttenBinaryTree
{
    Node root;
    public FlatttenBinaryTree()
    {
        root=null;
    }
    private class Node
    {
        Node left;
        Node right;
        int data;
        
        Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }        
        public void insert(int data)
        {
            root=insert(root,data);
                
        }
        
        public void flatten(Node root) 
        {
            if(root==null) return ;
            if(root.left == null && root.right == null) return ;
            if (root.left != null) 
            {
            flatten(root.left);
            Node temp=root.right;
            root.right=root.left;
            root.left=null;
            Node t=root.right;
            while(t.right!=null)
            {
                t=t.right;
            }
            t.right=temp;
            }
            flatten(root.right);
                
            
        }
        public Node insert(Node node,int data)
        {
            if(node==null)
                node=new Node(data);
            else{
                if(data<=node.data)
                    node.left=insert(node.left,data);
                else
                    node.right=insert(node.right,data);
            }
            return node;
     
        }
       

  
    
   
        
    public static void main(String[] arg)
    {
        BinaryTree tree=new BinaryTree();
        tree.insert(5);
          tree.insert(10);
            tree.insert(15);
              tree.insert(1);
       tree.printPreorder();
        tree.printInorder();
        System.out.println(tree.findmin());
          System.out.println(tree.findmax());
          System.out.println(tree.isValid());
          //tree.isValid();
    }
    }