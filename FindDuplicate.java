/* 287. Find the Duplicate Number
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:

    You must not modify the array (assume the array is read only).
    You must use only constant, O(1) extra space.
    Your runtime complexity should be less than O(n2).
    There is only one duplicate number in the array, but it could be repeated more than once.
    
    */
import java.util.*;
class FindDuplicate {
    public static int findDuplicate(int[] nums) 
    {
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums)
        {
            if(!set.contains(num))
            set.add(num);
            else 
                return num;
        }
        
     return -1;   
    }
    
    public static void main(String[] arg)
    {
        int[] nums={5,4,3,2,1};
        System.out.println(findDuplicate(nums));
    }
}
