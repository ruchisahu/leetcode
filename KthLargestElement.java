//215. Kth Largest Element in an Array

/*Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
*/
import java.util.*;
class KthLargestElement
{
    public static int findKthLargest(int[] nums, int k)
    {
        final PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         for(int val : nums) {
        pq.add(val);         // Inserts the specified element into this priority queue.
        
     while(pq.size() > k) 
     {
          //  pq.poll();
            System.out.println(pq.poll());
            
        }
    }
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    return pq.peek();
   
    }
      public static void main(String[] args) 
    {
        
        int[] a = {3,5,1,8,2,10,7};
        int k=1;
       System.out.println(findKthLargest(a,k));
    }
}