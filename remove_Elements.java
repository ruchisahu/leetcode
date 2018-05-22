/*203. Remove Linked List Elements
    Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
  */  
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class remove_Elements {
    public static ListNode removeElements(ListNode head, int val) 
    {
         if (head == null) return null;
        ListNode curr=head;
        while(curr!=null)
        {
           if(curr.val==val) 
           {
               curr.val=curr.next.val;
               curr.next=curr.next.next;
           }
           else
           {
           curr=curr.next;
           }
        }
        return head;
    }
    public static ListNode removeElements1(ListNode head, int val) 
    {
         if (head == null) return null;
        ListNode dummy=new ListNode(-1); 
        
            dummy.next=head;
        ListNode curr=head;
        ListNode dummy1=dummy;
         while(curr!=null)
        {
           if(curr.val==val) 
           {
               dummy1.next=curr.next;
           }
           else
           {
               dummy1=dummy1.next;
           }
           curr=curr.next;
         }
           return dummy.next;
    }
     public static void main(String[] arg)
    {
        ListNode test = ListFactory.test1();
        
        ListNode result=removeElements(test,7 ); 
        Print.printListNode( result );
        
    }
}