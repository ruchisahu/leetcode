/*268. Missing Number
  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2

Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
*/
<<<<<<< HEAD
import java.util.*;
class  missing_Number {
    public static int missingNumber(int[] nums) 
    {
        Arrays.sort(nums);
        if (nums[nums.length-1] != nums.length)
        {
            return nums.length;
        }
         else if (nums[0] != 0) {
            return 0;
         }
        int expect=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==expect)
            {
                expect=expect+1;
            }
            else
                return expect;
        }
        return -1;
=======
class  missing_Number {
    public static int missingNumber(int[] nums) 
    {
        return 1;
>>>>>>> 02c1c2c0c2cd7485d12eb48062ab313a125ed0f7
    }
    
     public static void main(String[] arg)
    {
<<<<<<< HEAD
        int[] nums={5,4,3,2,1,7};
=======
        int[] nums={5,4,3,2,1};
>>>>>>> 02c1c2c0c2cd7485d12eb48062ab313a125ed0f7
        System.out.println(missingNumber(nums) );
    }
}