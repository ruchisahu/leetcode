class mergeKLists1
{
   public static ListNode mergeKLists1(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        //control the step
        for(int step = 1;step < lists.length;step*=2)
            //merge two list every one step
            for(int i = 0;i < lists.length;i+=step*2)
            {
                if(i+step >= lists.length) break;
                lists[i] = mergeTwoLists(lists[i],lists[i+step]);
            }
        return lists[0];
    }
    
    public static  ListNode mergeKLists2(ListNode[] lists) {
    if (lists.length == 0) {
        return null;
    }

    int i = 1;
    ListNode newList = lists[0];
    ListNode p = newList;

    while (i < lists.length - 1) {
        newList = mergeTwoLists(newList, lists[i]);
        i++;
    }

    return lists[i];
}    
   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        while(l1 != null || l2 != null)
        {
            if(l2 == null || (l1 != null && l1.val <= l2.val))
            {
                tmp.next = l1;
                l1 = l1.next;
            }
            else 
            {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        return result.next;
    }
    
    
    public static void main(String[] arg)
    {
       
        ListNode l1 = ListFactory.mergeKtest1();
        ListNode l2 = ListFactory.mergeKtest2();
        ListNode l3 = ListFactory.mergeKtest3();
        ListNode[] lists={l1,l2,l3};
        ListNode result =  mergeKLists1( lists ) ;
      //   ListNode result =  mergeKLists2( lists ) ;
        Print.printListNode( result );
        
    }
}