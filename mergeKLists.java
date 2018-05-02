/*23. Merge k Sorted Lists
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class mergeKLists {
    public static ListNode merge_KLists(ListNode[] lists) 
    {
        if(lists.length < 1) 
            return null;
        int len = lists.length;
        for(int i = 1; i < len; i = 2*i)
        {
            for(int j = 0; j+i < len; j = j+2*i)
            {
                ListNode a = lists[j];
                ListNode b = lists[j+i];
                ListNode head = new ListNode(0);
                ListNode curr = head;
                while(a!=null && b!=null)
                {
                    ListNode c;
                    if(a.val > b.val)
                    {
                        c = b;
                        b = b.next;
                    }
                    else
                    {
                        c = a;
                        a = a.next;
                    }
                    curr.next=c;
                curr=curr.next;
                }
                
                curr.next = (a != null) ? a : b;
                lists[j] = head.next;
            }
        }
        return lists[0];
    }
    public static void main(String[] arg)
    {
       
        ListNode l1 = ListFactory.mergeKtest1();
        ListNode l2 = ListFactory.mergeKtest2();
        ListNode l3 = ListFactory.mergeKtest3();
        ListNode[] lists={l1,l2,l3};
        ListNode result =  merge_KLists( lists ) ;
        Print.printListNode( result );
        
    }
}