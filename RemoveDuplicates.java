/*83. Remove Duplicates from Sorted List
    
    Given a sorted linked list, delete all duplicates such that each element appear only once.
    
    Example 1:

Input: 1->1->2
Output: 1->2

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head) 
 {
        ListNode curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.val==curr.next.val)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head;
    }
     public static void main(String[] arg)
    {
       
        ListNode l1 = ListFactory.deleteDuplicates_test1();
        
       
        ListNode result =  deleteDuplicates(l1) ;
        Print.printListNode( result );
        
    }
}
