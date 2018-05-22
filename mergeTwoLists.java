/*21. Merge Two Sorted Lists
    
    Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/

class  mergeTwoLists
{
    public static ListNode mergeTwoLists(ListNode a, ListNode b) 
    {
       if (a == null) return b;
    if (b == null) return a;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(a!=null && b!=null)
        {
           
            if(a.val > b.val)
            {
                 curr.next = b;
                b = b.next;
            }
            else
            {
                curr.next = a;
                a = a.next;
            }
          //  curr.next=c;
            curr=curr.next;
        }
        
        curr.next = (a != null) ? a : b;
        
        
        return head.next;
    }
     public static void main(String[] arg)
    {
       
        ListNode l1 = ListFactory.mergeKtest1();
        ListNode l2 = ListFactory.mergeKtest2();
       
        ListNode result =  mergeTwoLists(l1,l2) ;
        Print.printListNode( result );
        
    }
}
