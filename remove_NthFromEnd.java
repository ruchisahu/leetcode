/*Remove Nth Node From End of List
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:

Given n will always be valid.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class remove_NthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode temp = new ListNode(0);
        ListNode curr=head;
        temp.next=head;
        while(curr!=null)
        {
            curr=curr.next;
            i++;
        }
       
       
        curr=temp;
        i=i-n;

        while(i>0)
        {
            
           curr=curr.next;

            
            i--;
        }
    
        curr.next=curr.next.next;
        return temp.next;
    }
   public static void main(String[] arg)
    {
        ListNode evenList = ListFactory.createEvenNodeList();
     ListNode result = removeNthFromEnd( evenList,2 ) ;
Print.printListNode( result );
     
    }
}