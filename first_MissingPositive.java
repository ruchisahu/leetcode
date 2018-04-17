/*41. First Missing Positive

Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space. 
*/


//correct ans Run time error with leetcode
import java.util.*;
class first_MissingPositive
{
    public static int firstMissingPositive(int[] nums)
    {
        int min=nums[0];
        int i1=0;
      HashSet<Integer> h = new HashSet<Integer>();
      
        int diff,diff1;
        diff1=100;
         for(int j=0;j<nums.length;j++)
        {
            h.add(nums[j]);
         }
         
          //  System.out.println(h.size());
        
        for(int i=1;i<nums.length;i++)
        {
           // h.add(nums[i]);
            if(nums[i]<min && nums[i]>=0)
                min=nums[i];
        }
     //   System.out.println(min);
        while(i1<nums.length)
        {
            System.out.println(min);
        //    min=min+1;
            if(h.contains(min))
            {
                 System.out.println("min"+min);
               min=min+1;
            }
            i1++;
        }
        
       return min; 
    }
 public static void main(String[] arg)
    {
     int[]a={3,4,-1,1};
        System.out.println(firstMissingPositive(a));
    }
}