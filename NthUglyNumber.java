/* Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number, and n does not exceed 1690. 
*/

import java.util.*;

class NthUglyNumber
{
    public static int nthUglyNumber(int n) {
        TreeSet<Long> ans = new TreeSet<Long>();
        ans.add(1L);
        for (int i = 0; i < n - 1; ++i) {
            long first = ans.pollFirst();
            ans.add(first * 2);
            ans.add(first * 3);
            ans.add(first * 5);
        }
        return ans.first().intValue();
    }
   
    
    
    public int nthUglyNumber1(int n) {
        if(n==1) return 1;
        PriorityQueue<Long> q = new PriorityQueue();
        q.add(1l);
        
        for(long i=1; i<n; i++) {
            long tmp = q.poll();
            while(!q.isEmpty() && q.peek()==tmp) tmp = q.poll();
            
            q.add(tmp*2);
            q.add(tmp*3);
            q.add(tmp*5);
        }
        return q.poll().intValue();
    }
    public static void main(String[] args) 
    {
        System.out.println(nthUglyNumber(10));
    }
    
}