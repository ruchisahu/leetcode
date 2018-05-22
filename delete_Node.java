/*237. Delete Node in a Linked List
     Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function. 
  */  
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class delete_Node {
    public static void deleteNode(ListNode node) 
    {
        
        node.val=node.next.val;
        node.next=node.next.next;
  //      Print.printListNode( node );           //7->2->4->3   delete 7
    }
    public static void main(String[] arg)
    {
        ListNode test = ListFactory.test1();
        
        deleteNode(test );                
        
    }
}