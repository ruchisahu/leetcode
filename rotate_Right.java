/*Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
*/

 
class  rotate_Right
{
    public static ListNode rotateRight(ListNode head, int k)
    {
        if(head==null)
        return null;
        if(k==0)return head;
       ListNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        if(k>count)
        {
            k=k%count;
            if(k==0)return head;
        }
     ListNode head1= reverseBetween(head, 1, count);
     ListNode head2= reverseBetween(head1, 1, k);
     ListNode head3= reverseBetween(head2, k+1, count);
       return head3;
    }
 

   
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    if(m==n) return head;
 
    ListNode prev = null;//track (m-1)th node
    ListNode first = new ListNode(0);//first's next points to mth
    ListNode second = new ListNode(0);//second's next points to (n+1)th
 
    int i=0;
    ListNode p = head;
    while(p!=null){
        i++;
        if(i==m-1){
            prev = p;
        }
 
        if(i==m){
            first.next = p;
        }
 
        if(i==n){
            second.next = p.next;
            p.next = null;
        }
 
        p= p.next;
    }
    if(first.next == null)
        return head;
 
    // reverse list [m, n]    
    ListNode p1 = first.next;
    ListNode p2 = p1.next;
    p1.next = second.next;
 
    while(p1!=null && p2!=null){
        ListNode t = p2.next;
        p2.next = p1;
        p1 = p2;
        p2 = t;
    }
 
    //connect to previous part
    if(prev!=null)
        prev.next = p1;
    else
        return p1;
 
    return head;
}
     public static void main(String[] arg)
    {
        ListNode evenList = ListFactory.createEvenNodeList();
     ListNode result = rotateRight( evenList,2 ) ;
Print.printListNode( result );
     
    }
}
   