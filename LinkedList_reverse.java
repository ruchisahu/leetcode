// Java program for reversing the linked list
 
class LinkedList_reverse {
 
    static ListNode head;
 
    static class ListNode {
 
        int val;
        ListNode next;
 
        ListNode(int d) {
            val = d;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast!=null)
        {
        fast=fast.next.next;
        slow=slow.next;
        
        }
        System.out.println("Given Linked list");
        System.out.println(fast.val);
        System.out.println(slow.val);
        if(fast!=null)
            slow=slow.next;
        
        slow=reverse(slow);
        fast=head;
     while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}
    
    /* Function to reverse the linked list */
    ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList_reverse list = new LinkedList_reverse();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
       // list.head.next.next.next = new ListNode(20);
        
       // System.out.println("Given Linked list");
       // list.printList(head);
        System.out.println(list.isPalindrome(head));
     //   head = list.reverse(head);
      //  System.out.println("");
    //    System.out.println("Reversed linked list ");
     //   list.printList(head);
    }
}
 