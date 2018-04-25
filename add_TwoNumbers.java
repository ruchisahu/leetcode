/*You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
*/
class add_TwoNumbers
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
                   
            ListNode h1=reverseList(l1);
            ListNode h2=reverseList(l2);
            int carry=0;
            ListNode sum=new ListNode(0);
            while(h1!=null || h2!=null || carry!=0)
            {
                int sum1=0;
                
                sum1=sum1+carry;
                if(h1!=null)
                {
                    sum1=sum1+h1.val;
                     
                    // System.out.println(h1.val);
                 //     System.out.println("sumh1="+sum1);
                     h1=h1.next;
                }
                
                if(h2!=null)
                {
                    sum1=sum1+h2.val;
                //    System.out.println("h2 b=val="+h2.val);
                 //    System.out.println("sumh2="+sum1);
                      h2=h2.next;
                   //    System.out.println(h1.val);
                }
             //    System.out.println("total sumh="+sum1);
               
                    carry=sum1/10;
                    sum1=sum1%10;
                 System.out.println("carry="+carry);
                System.out.println("sum1="+sum1);
                sum.val=sum1;
                ListNode node = new ListNode(sum1);
                node.next = sum;
                sum = node;
               
              
            }
            return  sum.next;
        }
        
        public static ListNode reverseList(ListNode head)
        {
            if(head==null||head.next==null)
                return head;
            
            ListNode p1 = head;
            ListNode p2 = p1.next;
            
            head.next = null;
            while(p1!=null&& p2!=null){
                ListNode t = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = t;
            }
            
            return p1;
        }
        public static void main(String[] arg)
        {
            ListNode evenList = ListFactory.test1();
            ListNode oddList = ListFactory.test2();
            ListNode result = addTwoNumbers( oddList,evenList ) ;
            Print.printListNode( result );
            
        }
    }
