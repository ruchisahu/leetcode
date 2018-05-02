
/*82. Remove Duplicates from Sorted List II
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5

Example 2:

Input: 1->1->1->2->3
Output: 2->3
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
class delete_Duplicates {
   
    public static ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
         if(head.next==null)
         {
        return head;
         }
         
         ListNode dummy = new ListNode(0);
    ListNode d = dummy;
    while (head != null) {
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val)
                head = head.next;
        } else {
            d.next = head;
            d = d.next;
        }
        head = head.next;
    }
   d.next = null;
    return dummy.next;
}
    
     public static void main(String[] arg)
    {
        ListNode evenList = ListFactory.deleteDuplicates_test1();
     //   ListNode evenList = ListFactory.test1();
        
     ListNode result = deleteDuplicates( evenList ) ;
Print.printListNode( result );
     
    }
}

